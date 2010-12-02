
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasMeasuringMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="normalTridasMeasuringMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Measuring platform"/>
 *     &lt;enumeration value="Hand lens and graticule"/>
 *     &lt;enumeration value="Onscreen measuring"/>
 *     &lt;enumeration value="Visual estimate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "normalTridasMeasuringMethod")
@XmlEnum
public enum NormalTridasMeasuringMethod {

    @XmlEnumValue("Measuring platform")
    MEASURING_PLATFORM("Measuring platform"),
    @XmlEnumValue("Hand lens and graticule")
    HAND_LENS_AND_GRATICULE("Hand lens and graticule"),
    @XmlEnumValue("Onscreen measuring")
    ONSCREEN_MEASURING("Onscreen measuring"),
    @XmlEnumValue("Visual estimate")
    VISUAL_ESTIMATE("Visual estimate");
    private final String value;

    NormalTridasMeasuringMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasMeasuringMethod fromValue(String v) {
        for (NormalTridasMeasuringMethod c: NormalTridasMeasuringMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
