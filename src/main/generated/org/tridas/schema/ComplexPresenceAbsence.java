
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexPresenceAbsence.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="complexPresenceAbsence"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="not applicable"/&gt;
 *     &lt;enumeration value="absent"/&gt;
 *     &lt;enumeration value="complete"/&gt;
 *     &lt;enumeration value="incomplete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "complexPresenceAbsence")
@XmlEnum
public enum ComplexPresenceAbsence {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("not applicable")
    NOT___APPLICABLE("not applicable"),
    @XmlEnumValue("absent")
    ABSENT("absent"),
    @XmlEnumValue("complete")
    COMPLETE("complete"),
    @XmlEnumValue("incomplete")
    INCOMPLETE("incomplete");
    private final String value;

    ComplexPresenceAbsence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplexPresenceAbsence fromValue(String v) {
        for (ComplexPresenceAbsence c: ComplexPresenceAbsence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
