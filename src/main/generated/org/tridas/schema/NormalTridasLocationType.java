
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
 *     &lt;enumeration value="Growth location"/>
 *     &lt;enumeration value="Location of use (static)"/>
 *     &lt;enumeration value="Location of use (mobile)"/>
 *     &lt;enumeration value="Current location"/>
 *     &lt;enumeration value="Manufacture location"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "normalTridasLocationType")
@XmlEnum
public enum NormalTridasLocationType {

    @XmlEnumValue("Growth location")
    GROWTH_LOCATION("Growth location"),
    @XmlEnumValue("Location of use (static)")
    LOCATION_OF_USE_STATIC("Location of use (static)"),
    @XmlEnumValue("Location of use (mobile)")
    LOCATION_OF_USE_MOBILE("Location of use (mobile)"),
    @XmlEnumValue("Current location")
    CURRENT_LOCATION("Current location"),
    @XmlEnumValue("Manufacture location")
    MANUFACTURE_LOCATION("Manufacture location");
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
