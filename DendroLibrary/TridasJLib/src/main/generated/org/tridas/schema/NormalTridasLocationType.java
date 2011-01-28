
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="normalTridasLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="growth location"/>
 *     &lt;enumeration value="location of use (static)"/>
 *     &lt;enumeration value="location of use (mobile)"/>
 *     &lt;enumeration value="current location"/>
 *     &lt;enumeration value="manufacture location"/>
 *     &lt;enumeration value="find location"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "normalTridasLocationType")
@XmlEnum
public enum NormalTridasLocationType {

    @XmlEnumValue("growth location")
    GROWTH_LOCATION("growth location"),
    @XmlEnumValue("location of use (static)")
    LOCATION_OF_USE_STATIC("location of use (static)"),
    @XmlEnumValue("location of use (mobile)")
    LOCATION_OF_USE_MOBILE("location of use (mobile)"),
    @XmlEnumValue("current location")
    CURRENT_LOCATION("current location"),
    @XmlEnumValue("manufacture location")
    MANUFACTURE_LOCATION("manufacture location"),
    @XmlEnumValue("find location")
    FIND___LOCATION("find location");
    private final String value;

    NormalTridasLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasLocationType fromValue(String v) {
        for (NormalTridasLocationType c: NormalTridasLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
