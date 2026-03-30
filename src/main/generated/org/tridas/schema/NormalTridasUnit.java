
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="normalTridasUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="micrometres"/&gt;
 *     &lt;enumeration value="1/100th millimetres"/&gt;
 *     &lt;enumeration value="1/50th millimetres"/&gt;
 *     &lt;enumeration value="1/20th millimetres"/&gt;
 *     &lt;enumeration value="1/10th millimetres"/&gt;
 *     &lt;enumeration value="millimetres"/&gt;
 *     &lt;enumeration value="centimetres"/&gt;
 *     &lt;enumeration value="metres"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "normalTridasUnit")
@XmlEnum
public enum NormalTridasUnit {

    @XmlEnumValue("micrometres")
    MICROMETRES("micrometres"),
    @XmlEnumValue("1/100th millimetres")
    HUNDREDTH_MM("1/100th millimetres"),
    @XmlEnumValue("1/50th millimetres")
    FIFTIETH_MM("1/50th millimetres"),
    @XmlEnumValue("1/20th millimetres")
    TWENTIETH_MM("1/20th millimetres"),
    @XmlEnumValue("1/10th millimetres")
    TENTH_MM("1/10th millimetres"),
    @XmlEnumValue("millimetres")
    MILLIMETRES("millimetres"),
    @XmlEnumValue("centimetres")
    CENTIMETRES("centimetres"),
    @XmlEnumValue("metres")
    METRES("metres");
    private final String value;

    NormalTridasUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasUnit fromValue(String v) {
        for (NormalTridasUnit c: NormalTridasUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
