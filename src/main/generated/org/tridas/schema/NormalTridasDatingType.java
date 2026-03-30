
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasDatingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="normalTridasDatingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="absolute"/&gt;
 *     &lt;enumeration value="dated with uncertainty"/&gt;
 *     &lt;enumeration value="relative"/&gt;
 *     &lt;enumeration value="radiocarbon"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "normalTridasDatingType")
@XmlEnum
public enum NormalTridasDatingType {

    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("dated with uncertainty")
    DATED_WITH_UNCERTAINTY("dated with uncertainty"),
    @XmlEnumValue("relative")
    RELATIVE("relative"),
    @XmlEnumValue("radiocarbon")
    RADIOCARBON("radiocarbon");
    private final String value;

    NormalTridasDatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasDatingType fromValue(String v) {
        for (NormalTridasDatingType c: NormalTridasDatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
