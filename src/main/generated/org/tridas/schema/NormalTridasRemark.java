
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasRemark.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="normalTridasRemark">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fire damage"/>
 *     &lt;enumeration value="Frost damage"/>
 *     &lt;enumeration value="Crack"/>
 *     &lt;enumeration value="False ring(s)"/>
 *     &lt;enumeration value="Compression wood"/>
 *     &lt;enumeration value="Tension wood"/>
 *     &lt;enumeration value="Traumatic ducts"/>
 *     &lt;enumeration value="Unspecified injury"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "normalTridasRemark")
@XmlEnum
public enum NormalTridasRemark {

    @XmlEnumValue("Fire damage")
    FIRE_DAMAGE("Fire damage"),
    @XmlEnumValue("Frost damage")
    FROST_DAMAGE("Frost damage"),
    @XmlEnumValue("Crack")
    CRACK("Crack"),
    @XmlEnumValue("False ring(s)")
    FALSE_RINGS("False ring(s)"),
    @XmlEnumValue("Compression wood")
    COMPRESSION_WOOD("Compression wood"),
    @XmlEnumValue("Tension wood")
    TENSION_WOOD("Tension wood"),
    @XmlEnumValue("Traumatic ducts")
    TRAUMATIC_DUCTS("Traumatic ducts"),
    @XmlEnumValue("Unspecified injury")
    UNSPECIFIED_INJURY("Unspecified injury");
    private final String value;

    NormalTridasRemark(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasRemark fromValue(String v) {
        for (NormalTridasRemark c: NormalTridasRemark.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
