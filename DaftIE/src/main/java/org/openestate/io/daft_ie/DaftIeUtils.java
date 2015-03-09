/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.daft_ie;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.core.LocaleUtils;
import org.openestate.io.core.SilentValidationHandler;
import org.openestate.io.daft_ie.xml.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * DaftIeUtils.
 *
 * @author Andreas Rudolph
 */
public class DaftIeUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( DaftIeUtils.class );
  public final static String PACKAGE = "org.openestate.io.daft_ie.xml";
  public final static String NAMESPACE = StringUtils.EMPTY;
  public final static DaftIeVersion VERSION = DaftIeVersion.V2_7;
  public final static Locale DEFAULT_LOCALE = Locale.ENGLISH;
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private DaftIeUtils()
  {
  }

  public static DaftIeDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static DaftIeDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static DaftIeDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static DaftIeDocument createDocument( Document doc )
  {
    if (DaftIeDocument.isTransferDocument( doc ))
      return new DaftIeDocument( doc );
    else
      return null;
  }

  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  public static Marshaller createMarshaller( String encoding, boolean formatted ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, formatted );
    m.setEventHandler( new SilentValidationHandler() );
    return m;
  }

  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    Unmarshaller m = getContext().createUnmarshaller();
    m.setEventHandler( new SilentValidationHandler() );
    return m;
  }

  public static Element createUserDefinedSimplefield( Document doc, String name, String value )
  {
    Element root = DocumentUtils.getRootElement( doc );
    Element node = doc.createElementNS( root.getNamespaceURI(), "user_defined_simplefield" );
    node.setAttribute( "feldname", name );
    node.setTextContent( value );
    return node;
  }

  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  public static String getCountryName( String country )
  {
    return LocaleUtils.getCountryName( country, Locale.ENGLISH );
  }

  public static DateFormat getDateFormat()
  {
    return new SimpleDateFormat( "yyyy-MM-dd" );
  }

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }

  public static Boolean parseBoolean( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null)
      return null;
    else if ("1".equals( value ))
      return Boolean.TRUE;
    else if ("0".equals( value ))
      return Boolean.FALSE;
    else
      throw new IllegalArgumentException( "Can't parse boolean value '"+value+"'!" );
  }

  public static String parseCountry( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static Calendar parseDate( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseDate( value );
    }
    catch (IllegalArgumentException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "dd.MM.yyyy", "dd.MM.yy", "dd/MM/yyyy", "dd/MM/yy", "dd-MM-yyyy",
        "dd-MMM-yyyy", "yyyy-MM-dd", "yyyy/MM/dd", "yyyy-D", "MM/yyyy",
        "MMM yyyy", "MMMMM yyyy", "yyyy" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse date value '"+value+"'!" );
  }

  public static Calendar parseDateTime( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseDateTime( value );
    }
    catch (IllegalArgumentException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "yyyy-MM-dd'T'hh:mm:ss", "yyyy-MM-dd'T'hh:mm" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse date-time value '"+value+"'!" );
  }

  public static Double parseDouble( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static Integer parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static URL parseURL( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      if (!StringUtils.startsWithIgnoreCase( value, "http://" ) && !StringUtils.startsWithIgnoreCase( value, "https://" ))
        return new URL( "http://" + value );
      else
        return new URL( value );
    }
    catch (MalformedURLException ex)
    {
      throw new IllegalArgumentException( "Can't parse URL value '" + value + "'!", ex );
    }
  }

  public static String printBoolean( Boolean value )
  {
    if (Boolean.TRUE.equals( value ) )
      return "1";
    else if (Boolean.FALSE.equals( value ) )
      return "0";
    else
      throw new IllegalArgumentException( "Can't print boolean value!" );
  }

  public static String printCountry( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null)
      throw new IllegalArgumentException( "Can't print country value!" );

    String country = StringUtils.trimToNull( DaftIeUtils.getCountryName( value ) );
    if (country==null)
    {
      LOGGER.warn( "Can't convert country '" + value + "' to its english name!" );
      return value;
    }
    else
    {
      return country;
    }
  }

  public static String printDate( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date value!" );
    else
      return getDateFormat().format( value.getTime() );
  }

  public static String printDateTime( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date-time value!" );
    else
      return DatatypeConverter.printDateTime(value );
  }

  public static String printDouble( Double value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print double value!" );
    else
      return DatatypeConverter.printDouble( value );
  }

  public static String printInteger( Integer value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printInt( value );
  }

  public static String printURL( URL value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print URL value!" );
    else
      return value.toString();
  }
}