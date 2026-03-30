
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasVariable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="normalTridasVariable"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ring width"/&gt;
 *     &lt;enumeration value="earlywood width"/&gt;
 *     &lt;enumeration value="latewood width"/&gt;
 *     &lt;enumeration value="ring density"/&gt;
 *     &lt;enumeration value="earlywood density"/&gt;
 *     &lt;enumeration value="latewood density"/&gt;
 *     &lt;enumeration value="maximum density"/&gt;
 *     &lt;enumeration value="latewood percent"/&gt;
 *     &lt;enumeration value="vessel size"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "normalTridasVariable")
@XmlEnum
public enum NormalTridasVariable {

    @XmlEnumValue("ring width")
    RING_WIDTH("ring width"),
    @XmlEnumValue("earlywood width")
    EARLYWOOD_WIDTH("earlywood width"),
    @XmlEnumValue("latewood width")
    LATEWOOD_WIDTH("latewood width"),
    @XmlEnumValue("ring density")
    RING_DENSITY("ring density"),
    @XmlEnumValue("earlywood density")
    EARLYWOOD_DENSITY("earlywood density"),
    @XmlEnumValue("latewood density")
    LATEWOOD_DENSITY("latewood density"),
    @XmlEnumValue("maximum density")
    MAXIMUM_DENSITY("maximum density"),
    @XmlEnumValue("latewood percent")
    LATEWOOD_PERCENT("latewood percent"),
    @XmlEnumValue("vessel size")
    VESSEL___SIZE("vessel size");
    private final String value;

    NormalTridasVariable(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasVariable fromValue(String v) {
        for (NormalTridasVariable c: NormalTridasVariable.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
