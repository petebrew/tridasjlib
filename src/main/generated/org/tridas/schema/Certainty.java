
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certainty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="certainty"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="exact"/&gt;
 *     &lt;enumeration value="approximately"/&gt;
 *     &lt;enumeration value="after"/&gt;
 *     &lt;enumeration value="before"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "certainty")
@XmlEnum
public enum Certainty {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("exact")
    EXACT("exact"),
    @XmlEnumValue("approximately")
    APPROXIMATELY("approximately"),
    @XmlEnumValue("after")
    AFTER("after"),
    @XmlEnumValue("before")
    BEFORE("before");
    private final String value;

    Certainty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Certainty fromValue(String v) {
        for (Certainty c: Certainty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
