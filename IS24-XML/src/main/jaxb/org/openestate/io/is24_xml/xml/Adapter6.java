
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseText40(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printText40(value));
    }

}