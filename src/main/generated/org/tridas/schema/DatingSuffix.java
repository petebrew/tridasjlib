
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datingSuffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="datingSuffix"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="BC"/&gt;
 *     &lt;enumeration value="BP"/&gt;
 *     &lt;enumeration value="relative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "datingSuffix")
@XmlEnum
public enum DatingSuffix {

    AD("AD"),
    BC("BC"),
    BP("BP"),
    @XmlEnumValue("relative")
    RELATIVE("relative");
    private final String value;

    DatingSuffix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatingSuffix fromValue(String v) {
        for (DatingSuffix c: DatingSuffix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
