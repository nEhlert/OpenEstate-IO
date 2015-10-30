
package org.openestate.io.immobiliare_it.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for locationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="country-code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[a-zA-Z]{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sub-administrative-area"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="city"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locality" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="neighbourhood" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="district"/&gt;
 *                                 &lt;enumeration value="locality"/&gt;
 *                                 &lt;enumeration value="area"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="thoroughfare" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="display"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;pattern value="yes|no"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="postal-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="longitude" type="{http://feed.immobiliare.it}longitudeType"/&gt;
 *                   &lt;element name="latitude" type="{http://feed.immobiliare.it}latitudeType"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationStructure", propOrder = {

})
public class LocationStructure
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "country-code", required = true)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected String countryCode;
    @XmlElement(name = "administrative-area", required = true)
    protected String administrativeArea;
    @XmlElement(name = "sub-administrative-area", required = true)
    protected LocationStructure.SubAdministrativeArea subAdministrativeArea;
    @XmlElement(required = true)
    protected LocationStructure.City city;
    protected LocationStructure.Locality locality;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeArea(String value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the subAdministrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.SubAdministrativeArea }
     *     
     */
    public LocationStructure.SubAdministrativeArea getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    /**
     * Sets the value of the subAdministrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.SubAdministrativeArea }
     *     
     */
    public void setSubAdministrativeArea(LocationStructure.SubAdministrativeArea value) {
        this.subAdministrativeArea = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.City }
     *     
     */
    public LocationStructure.City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.City }
     *     
     */
    public void setCity(LocationStructure.City value) {
        this.city = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.Locality }
     *     
     */
    public LocationStructure.Locality getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.Locality }
     *     
     */
    public void setLocality(LocationStructure.Locality value) {
        this.locality = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theCountryCode;
            theCountryCode = this.getCountryCode();
            strategy.appendField(locator, this, "countryCode", buffer, theCountryCode);
        }
        {
            String theAdministrativeArea;
            theAdministrativeArea = this.getAdministrativeArea();
            strategy.appendField(locator, this, "administrativeArea", buffer, theAdministrativeArea);
        }
        {
            LocationStructure.SubAdministrativeArea theSubAdministrativeArea;
            theSubAdministrativeArea = this.getSubAdministrativeArea();
            strategy.appendField(locator, this, "subAdministrativeArea", buffer, theSubAdministrativeArea);
        }
        {
            LocationStructure.City theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            LocationStructure.Locality theLocality;
            theLocality = this.getLocality();
            strategy.appendField(locator, this, "locality", buffer, theLocality);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LocationStructure) {
            final LocationStructure copy = ((LocationStructure) draftCopy);
            if (this.countryCode!= null) {
                String sourceCountryCode;
                sourceCountryCode = this.getCountryCode();
                String copyCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "countryCode", sourceCountryCode), sourceCountryCode));
                copy.setCountryCode(copyCountryCode);
            } else {
                copy.countryCode = null;
            }
            if (this.administrativeArea!= null) {
                String sourceAdministrativeArea;
                sourceAdministrativeArea = this.getAdministrativeArea();
                String copyAdministrativeArea = ((String) strategy.copy(LocatorUtils.property(locator, "administrativeArea", sourceAdministrativeArea), sourceAdministrativeArea));
                copy.setAdministrativeArea(copyAdministrativeArea);
            } else {
                copy.administrativeArea = null;
            }
            if (this.subAdministrativeArea!= null) {
                LocationStructure.SubAdministrativeArea sourceSubAdministrativeArea;
                sourceSubAdministrativeArea = this.getSubAdministrativeArea();
                LocationStructure.SubAdministrativeArea copySubAdministrativeArea = ((LocationStructure.SubAdministrativeArea) strategy.copy(LocatorUtils.property(locator, "subAdministrativeArea", sourceSubAdministrativeArea), sourceSubAdministrativeArea));
                copy.setSubAdministrativeArea(copySubAdministrativeArea);
            } else {
                copy.subAdministrativeArea = null;
            }
            if (this.city!= null) {
                LocationStructure.City sourceCity;
                sourceCity = this.getCity();
                LocationStructure.City copyCity = ((LocationStructure.City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity));
                copy.setCity(copyCity);
            } else {
                copy.city = null;
            }
            if (this.locality!= null) {
                LocationStructure.Locality sourceLocality;
                sourceLocality = this.getLocality();
                LocationStructure.Locality copyLocality = ((LocationStructure.Locality) strategy.copy(LocatorUtils.property(locator, "locality", sourceLocality), sourceLocality));
                copy.setLocality(copyLocality);
            } else {
                copy.locality = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LocationStructure();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LocationStructure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LocationStructure that = ((LocationStructure) object);
        {
            String lhsCountryCode;
            lhsCountryCode = this.getCountryCode();
            String rhsCountryCode;
            rhsCountryCode = that.getCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode)) {
                return false;
            }
        }
        {
            String lhsAdministrativeArea;
            lhsAdministrativeArea = this.getAdministrativeArea();
            String rhsAdministrativeArea;
            rhsAdministrativeArea = that.getAdministrativeArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "administrativeArea", lhsAdministrativeArea), LocatorUtils.property(thatLocator, "administrativeArea", rhsAdministrativeArea), lhsAdministrativeArea, rhsAdministrativeArea)) {
                return false;
            }
        }
        {
            LocationStructure.SubAdministrativeArea lhsSubAdministrativeArea;
            lhsSubAdministrativeArea = this.getSubAdministrativeArea();
            LocationStructure.SubAdministrativeArea rhsSubAdministrativeArea;
            rhsSubAdministrativeArea = that.getSubAdministrativeArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subAdministrativeArea", lhsSubAdministrativeArea), LocatorUtils.property(thatLocator, "subAdministrativeArea", rhsSubAdministrativeArea), lhsSubAdministrativeArea, rhsSubAdministrativeArea)) {
                return false;
            }
        }
        {
            LocationStructure.City lhsCity;
            lhsCity = this.getCity();
            LocationStructure.City rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                return false;
            }
        }
        {
            LocationStructure.Locality lhsLocality;
            lhsLocality = this.getLocality();
            LocationStructure.Locality rhsLocality;
            rhsLocality = that.getLocality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locality", lhsLocality), LocatorUtils.property(thatLocator, "locality", rhsLocality), lhsLocality, rhsLocality)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class City
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "integer")
        protected BigInteger code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigInteger getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(BigInteger value) {
            this.code = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
            }
            {
                BigInteger theCode;
                theCode = this.getCode();
                strategy.appendField(locator, this, "code", buffer, theCode);
            }
            return buffer;
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LocationStructure.City) {
                final LocationStructure.City copy = ((LocationStructure.City) draftCopy);
                if (this.value!= null) {
                    String sourceValue;
                    sourceValue = this.getValue();
                    String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                    copy.setValue(copyValue);
                } else {
                    copy.value = null;
                }
                if (this.code!= null) {
                    BigInteger sourceCode;
                    sourceCode = this.getCode();
                    BigInteger copyCode = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
                    copy.setCode(copyCode);
                } else {
                    copy.code = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new LocationStructure.City();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof LocationStructure.City)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LocationStructure.City that = ((LocationStructure.City) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                    return false;
                }
            }
            {
                BigInteger lhsCode;
                lhsCode = this.getCode();
                BigInteger rhsCode;
                rhsCode = that.getCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="neighbourhood" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="district"/&gt;
     *                       &lt;enumeration value="locality"/&gt;
     *                       &lt;enumeration value="area"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="thoroughfare" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="display"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;pattern value="yes|no"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="postal-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="longitude" type="{http://feed.immobiliare.it}longitudeType"/&gt;
     *         &lt;element name="latitude" type="{http://feed.immobiliare.it}latitudeType"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Locality
        implements Cloneable, CopyTo, Equals, ToString
    {

        protected LocationStructure.Locality.Neighbourhood neighbourhood;
        protected LocationStructure.Locality.Thoroughfare thoroughfare;
        @XmlElement(name = "postal-code")
        protected String postalCode;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter9 .class)
        @XmlSchemaType(name = "decimal")
        protected BigDecimal longitude;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter8 .class)
        @XmlSchemaType(name = "decimal")
        protected BigDecimal latitude;

        /**
         * Gets the value of the neighbourhood property.
         * 
         * @return
         *     possible object is
         *     {@link LocationStructure.Locality.Neighbourhood }
         *     
         */
        public LocationStructure.Locality.Neighbourhood getNeighbourhood() {
            return neighbourhood;
        }

        /**
         * Sets the value of the neighbourhood property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationStructure.Locality.Neighbourhood }
         *     
         */
        public void setNeighbourhood(LocationStructure.Locality.Neighbourhood value) {
            this.neighbourhood = value;
        }

        /**
         * Gets the value of the thoroughfare property.
         * 
         * @return
         *     possible object is
         *     {@link LocationStructure.Locality.Thoroughfare }
         *     
         */
        public LocationStructure.Locality.Thoroughfare getThoroughfare() {
            return thoroughfare;
        }

        /**
         * Sets the value of the thoroughfare property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationStructure.Locality.Thoroughfare }
         *     
         */
        public void setThoroughfare(LocationStructure.Locality.Thoroughfare value) {
            this.thoroughfare = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(BigDecimal value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(BigDecimal value) {
            this.latitude = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                LocationStructure.Locality.Neighbourhood theNeighbourhood;
                theNeighbourhood = this.getNeighbourhood();
                strategy.appendField(locator, this, "neighbourhood", buffer, theNeighbourhood);
            }
            {
                LocationStructure.Locality.Thoroughfare theThoroughfare;
                theThoroughfare = this.getThoroughfare();
                strategy.appendField(locator, this, "thoroughfare", buffer, theThoroughfare);
            }
            {
                String thePostalCode;
                thePostalCode = this.getPostalCode();
                strategy.appendField(locator, this, "postalCode", buffer, thePostalCode);
            }
            {
                BigDecimal theLongitude;
                theLongitude = this.getLongitude();
                strategy.appendField(locator, this, "longitude", buffer, theLongitude);
            }
            {
                BigDecimal theLatitude;
                theLatitude = this.getLatitude();
                strategy.appendField(locator, this, "latitude", buffer, theLatitude);
            }
            return buffer;
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LocationStructure.Locality) {
                final LocationStructure.Locality copy = ((LocationStructure.Locality) draftCopy);
                if (this.neighbourhood!= null) {
                    LocationStructure.Locality.Neighbourhood sourceNeighbourhood;
                    sourceNeighbourhood = this.getNeighbourhood();
                    LocationStructure.Locality.Neighbourhood copyNeighbourhood = ((LocationStructure.Locality.Neighbourhood) strategy.copy(LocatorUtils.property(locator, "neighbourhood", sourceNeighbourhood), sourceNeighbourhood));
                    copy.setNeighbourhood(copyNeighbourhood);
                } else {
                    copy.neighbourhood = null;
                }
                if (this.thoroughfare!= null) {
                    LocationStructure.Locality.Thoroughfare sourceThoroughfare;
                    sourceThoroughfare = this.getThoroughfare();
                    LocationStructure.Locality.Thoroughfare copyThoroughfare = ((LocationStructure.Locality.Thoroughfare) strategy.copy(LocatorUtils.property(locator, "thoroughfare", sourceThoroughfare), sourceThoroughfare));
                    copy.setThoroughfare(copyThoroughfare);
                } else {
                    copy.thoroughfare = null;
                }
                if (this.postalCode!= null) {
                    String sourcePostalCode;
                    sourcePostalCode = this.getPostalCode();
                    String copyPostalCode = ((String) strategy.copy(LocatorUtils.property(locator, "postalCode", sourcePostalCode), sourcePostalCode));
                    copy.setPostalCode(copyPostalCode);
                } else {
                    copy.postalCode = null;
                }
                if (this.longitude!= null) {
                    BigDecimal sourceLongitude;
                    sourceLongitude = this.getLongitude();
                    BigDecimal copyLongitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitude", sourceLongitude), sourceLongitude));
                    copy.setLongitude(copyLongitude);
                } else {
                    copy.longitude = null;
                }
                if (this.latitude!= null) {
                    BigDecimal sourceLatitude;
                    sourceLatitude = this.getLatitude();
                    BigDecimal copyLatitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitude", sourceLatitude), sourceLatitude));
                    copy.setLatitude(copyLatitude);
                } else {
                    copy.latitude = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new LocationStructure.Locality();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof LocationStructure.Locality)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LocationStructure.Locality that = ((LocationStructure.Locality) object);
            {
                LocationStructure.Locality.Neighbourhood lhsNeighbourhood;
                lhsNeighbourhood = this.getNeighbourhood();
                LocationStructure.Locality.Neighbourhood rhsNeighbourhood;
                rhsNeighbourhood = that.getNeighbourhood();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "neighbourhood", lhsNeighbourhood), LocatorUtils.property(thatLocator, "neighbourhood", rhsNeighbourhood), lhsNeighbourhood, rhsNeighbourhood)) {
                    return false;
                }
            }
            {
                LocationStructure.Locality.Thoroughfare lhsThoroughfare;
                lhsThoroughfare = this.getThoroughfare();
                LocationStructure.Locality.Thoroughfare rhsThoroughfare;
                rhsThoroughfare = that.getThoroughfare();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "thoroughfare", lhsThoroughfare), LocatorUtils.property(thatLocator, "thoroughfare", rhsThoroughfare), lhsThoroughfare, rhsThoroughfare)) {
                    return false;
                }
            }
            {
                String lhsPostalCode;
                lhsPostalCode = this.getPostalCode();
                String rhsPostalCode;
                rhsPostalCode = that.getPostalCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode)) {
                    return false;
                }
            }
            {
                BigDecimal lhsLongitude;
                lhsLongitude = this.getLongitude();
                BigDecimal rhsLongitude;
                rhsLongitude = that.getLongitude();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude)) {
                    return false;
                }
            }
            {
                BigDecimal lhsLatitude;
                lhsLatitude = this.getLatitude();
                BigDecimal rhsLatitude;
                rhsLatitude = that.getLatitude();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="district"/&gt;
         *             &lt;enumeration value="locality"/&gt;
         *             &lt;enumeration value="area"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Neighbourhood
            implements Cloneable, CopyTo, Equals, ToString
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType type;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(Adapter2 .class)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger id;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType }
             *     
             */
            public LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType }
             *     
             */
            public void setType(LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType value) {
                this.type = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            public String toString() {
                final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                {
                    String theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue);
                }
                {
                    LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType theType;
                    theType = this.getType();
                    strategy.appendField(locator, this, "type", buffer, theType);
                }
                {
                    BigInteger theId;
                    theId = this.getId();
                    strategy.appendField(locator, this, "id", buffer, theId);
                }
                return buffer;
            }

            public Object clone() {
                return copyTo(createNewInstance());
            }

            public Object copyTo(Object target) {
                final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof LocationStructure.Locality.Neighbourhood) {
                    final LocationStructure.Locality.Neighbourhood copy = ((LocationStructure.Locality.Neighbourhood) draftCopy);
                    if (this.value!= null) {
                        String sourceValue;
                        sourceValue = this.getValue();
                        String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                        copy.setValue(copyValue);
                    } else {
                        copy.value = null;
                    }
                    if (this.type!= null) {
                        LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType sourceType;
                        sourceType = this.getType();
                        LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType copyType = ((LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                        copy.setType(copyType);
                    } else {
                        copy.type = null;
                    }
                    if (this.id!= null) {
                        BigInteger sourceId;
                        sourceId = this.getId();
                        BigInteger copyId = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                        copy.setId(copyId);
                    } else {
                        copy.id = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new LocationStructure.Locality.Neighbourhood();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof LocationStructure.Locality.Neighbourhood)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final LocationStructure.Locality.Neighbourhood that = ((LocationStructure.Locality.Neighbourhood) object);
                {
                    String lhsValue;
                    lhsValue = this.getValue();
                    String rhsValue;
                    rhsValue = that.getValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                        return false;
                    }
                }
                {
                    LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType lhsType;
                    lhsType = this.getType();
                    LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType rhsType;
                    rhsType = that.getType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsId;
                    lhsId = this.getId();
                    BigInteger rhsId;
                    rhsId = that.getId();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }


            /**
             * <p>Java class for null.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p>
             * <pre>
             * &lt;simpleType&gt;
             *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *     &lt;enumeration value="district"/&gt;
             *     &lt;enumeration value="locality"/&gt;
             *     &lt;enumeration value="area"/&gt;
             *   &lt;/restriction&gt;
             * &lt;/simpleType&gt;
             * </pre>
             * 
             */
            @XmlType(name = "")
            @XmlEnum
            public enum LocationNeighbourhoodType {

                @XmlEnumValue("district")
                DISTRICT("district"),
                @XmlEnumValue("locality")
                LOCALITY("locality"),
                @XmlEnumValue("area")
                AREA("area");
                private final String value;

                LocationNeighbourhoodType(String v) {
                    value = v;
                }

                public String value() {
                    return value;
                }

                public static LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType fromValue(String v) {
                    for (LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType c: LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType.values()) {
                        if (c.value.equals(v)) {
                            return c;
                        }
                    }
                    throw new IllegalArgumentException(v);
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="display"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;pattern value="yes|no"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Thoroughfare
            implements Cloneable, CopyTo, Equals, ToString
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "display")
            @XmlJavaTypeAdapter(Adapter20 .class)
            protected Boolean display;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the display property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Boolean isDisplay() {
                return display;
            }

            /**
             * Sets the value of the display property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplay(Boolean value) {
                this.display = value;
            }

            public String toString() {
                final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                {
                    String theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue);
                }
                {
                    Boolean theDisplay;
                    theDisplay = this.isDisplay();
                    strategy.appendField(locator, this, "display", buffer, theDisplay);
                }
                return buffer;
            }

            public Object clone() {
                return copyTo(createNewInstance());
            }

            public Object copyTo(Object target) {
                final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof LocationStructure.Locality.Thoroughfare) {
                    final LocationStructure.Locality.Thoroughfare copy = ((LocationStructure.Locality.Thoroughfare) draftCopy);
                    if (this.value!= null) {
                        String sourceValue;
                        sourceValue = this.getValue();
                        String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                        copy.setValue(copyValue);
                    } else {
                        copy.value = null;
                    }
                    if (this.display!= null) {
                        Boolean sourceDisplay;
                        sourceDisplay = this.isDisplay();
                        Boolean copyDisplay = ((Boolean) strategy.copy(LocatorUtils.property(locator, "display", sourceDisplay), sourceDisplay));
                        copy.setDisplay(copyDisplay);
                    } else {
                        copy.display = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new LocationStructure.Locality.Thoroughfare();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof LocationStructure.Locality.Thoroughfare)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final LocationStructure.Locality.Thoroughfare that = ((LocationStructure.Locality.Thoroughfare) object);
                {
                    String lhsValue;
                    lhsValue = this.getValue();
                    String rhsValue;
                    rhsValue = that.getValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                        return false;
                    }
                }
                {
                    Boolean lhsDisplay;
                    lhsDisplay = this.isDisplay();
                    Boolean rhsDisplay;
                    rhsDisplay = that.isDisplay();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay)) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SubAdministrativeArea
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
            }
            {
                String theCode;
                theCode = this.getCode();
                strategy.appendField(locator, this, "code", buffer, theCode);
            }
            return buffer;
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LocationStructure.SubAdministrativeArea) {
                final LocationStructure.SubAdministrativeArea copy = ((LocationStructure.SubAdministrativeArea) draftCopy);
                if (this.value!= null) {
                    String sourceValue;
                    sourceValue = this.getValue();
                    String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                    copy.setValue(copyValue);
                } else {
                    copy.value = null;
                }
                if (this.code!= null) {
                    String sourceCode;
                    sourceCode = this.getCode();
                    String copyCode = ((String) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
                    copy.setCode(copyCode);
                } else {
                    copy.code = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new LocationStructure.SubAdministrativeArea();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof LocationStructure.SubAdministrativeArea)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LocationStructure.SubAdministrativeArea that = ((LocationStructure.SubAdministrativeArea) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                    return false;
                }
            }
            {
                String lhsCode;
                lhsCode = this.getCode();
                String rhsCode;
                rhsCode = that.getCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
