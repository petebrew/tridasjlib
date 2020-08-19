
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
 *     &lt;enumeration value="fire damage"/>
 *     &lt;enumeration value="frost damage"/>
 *     &lt;enumeration value="crack"/>
 *     &lt;enumeration value="false ring(s)"/>
 *     &lt;enumeration value="compression wood"/>
 *     &lt;enumeration value="tension wood"/>
 *     &lt;enumeration value="traumatic ducts"/>
 *     &lt;enumeration value="unspecified injury"/>
 *     &lt;enumeration value="single pinned"/>
 *     &lt;enumeration value="double pinned"/>
 *     &lt;enumeration value="triple pinned"/>
 *     &lt;enumeration value="missing ring"/>
 *     &lt;enumeration value="radius shift up"/>
 *     &lt;enumeration value="radius shift down"/>
 *     &lt;enumeration value="moon ring(s)"/>
 *     &lt;enumeration value="diffuse latewood"/>
 *     &lt;enumeration value="density fluctuation"/>
 *     &lt;enumeration value="wide late wood"/>
 *     &lt;enumeration value="wide early wood"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "normalTridasRemark")
@XmlEnum
public enum NormalTridasRemark {

    @XmlEnumValue("fire damage")
    FIRE_DAMAGE("fire damage"),
    @XmlEnumValue("frost damage")
    FROST_DAMAGE("frost damage"),
    @XmlEnumValue("crack")
    CRACK("crack"),
    @XmlEnumValue("false ring(s)")
    FALSE_RINGS("false ring(s)"),
    @XmlEnumValue("compression wood")
    COMPRESSION_WOOD("compression wood"),
    @XmlEnumValue("tension wood")
    TENSION_WOOD("tension wood"),
    @XmlEnumValue("traumatic ducts")
    TRAUMATIC_DUCTS("traumatic ducts"),
    @XmlEnumValue("unspecified injury")
    UNSPECIFIED_INJURY("unspecified injury"),
    @XmlEnumValue("single pinned")
    SINGLE_PINNED("single pinned"),
    @XmlEnumValue("double pinned")
    DOUBLE_PINNED("double pinned"),
    @XmlEnumValue("triple pinned")
    TRIPLE_PINNED("triple pinned"),
    @XmlEnumValue("missing ring")
    MISSING_RING("missing ring"),
    @XmlEnumValue("radius shift up")
    RADIUS_SHIFT_UP("radius shift up"),
    @XmlEnumValue("radius shift down")
    RADIUS_SHIFT_DOWN("radius shift down"),
    @XmlEnumValue("moon ring(s)")
    MOON_RINGS("moon ring(s)"),
    @XmlEnumValue("diffuse latewood")
    DIFFUSE_LATEWOOD("diffuse latewood"),
    @XmlEnumValue("density fluctuation")
    DENSITY_FLUCTUATION("density fluctuation"),
    @XmlEnumValue("wide late wood")
    WIDE_LATE_WOOD("wide late wood"),
    @XmlEnumValue("wide early wood")
    WIDE_EARLY_WOOD("wide early wood");
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
