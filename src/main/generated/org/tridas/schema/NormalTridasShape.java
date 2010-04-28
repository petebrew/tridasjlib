
package org.tridas.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalTridasShape.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="normalTridasShape">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Whole section"/>
 *     &lt;enumeration value="Half section"/>
 *     &lt;enumeration value="Third section"/>
 *     &lt;enumeration value="Quarter section"/>
 *     &lt;enumeration value="Wedge where radius is smaller than circumference"/>
 *     &lt;enumeration value="Wedge where radius equals the circumference"/>
 *     &lt;enumeration value="Wedge where radius is bigger than the circumference"/>
 *     &lt;enumeration value="Beam straightened on one side"/>
 *     &lt;enumeration value="Squared beam from whole section"/>
 *     &lt;enumeration value="Squared beam from half section"/>
 *     &lt;enumeration value="Squared beam from quarter section"/>
 *     &lt;enumeration value="Plank cut on one side"/>
 *     &lt;enumeration value="Radial plank through pith"/>
 *     &lt;enumeration value="Radial plank up to pith"/>
 *     &lt;enumeration value="Tangential plank not including pith with breadth larger than a quarter section"/>
 *     &lt;enumeration value="Plank not including pith with breadth smaller than a quarter section"/>
 *     &lt;enumeration value="Small part of section"/>
 *     &lt;enumeration value="Part of undetermined section"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "normalTridasShape")
@XmlEnum
public enum NormalTridasShape {

    @XmlEnumValue("Whole section")
    WHOLE___SECTION("Whole section"),
    @XmlEnumValue("Half section")
    HALF___SECTION("Half section"),
    @XmlEnumValue("Third section")
    THIRD___SECTION("Third section"),
    @XmlEnumValue("Quarter section")
    QUARTER___SECTION("Quarter section"),
    @XmlEnumValue("Wedge where radius is smaller than circumference")
    WEDGE___WHERE___RADIUS___IS___SMALLER___THAN___CIRCUMFERENCE("Wedge where radius is smaller than circumference"),
    @XmlEnumValue("Wedge where radius equals the circumference")
    WEDGE___WHERE___RADIUS___EQUALS___THE___CIRCUMFERENCE("Wedge where radius equals the circumference"),
    @XmlEnumValue("Wedge where radius is bigger than the circumference")
    WEDGE___WHERE___RADIUS___IS___BIGGER___THAN___THE___CIRCUMFERENCE("Wedge where radius is bigger than the circumference"),
    @XmlEnumValue("Beam straightened on one side")
    BEAM___STRAIGHTENED___ON___ONE___SIDE("Beam straightened on one side"),
    @XmlEnumValue("Squared beam from whole section")
    SQUARED___BEAM___FROM___WHOLE___SECTION("Squared beam from whole section"),
    @XmlEnumValue("Squared beam from half section")
    SQUARED___BEAM___FROM___HALF___SECTION("Squared beam from half section"),
    @XmlEnumValue("Squared beam from quarter section")
    SQUARED___BEAM___FROM___QUARTER___SECTION("Squared beam from quarter section"),
    @XmlEnumValue("Plank cut on one side")
    PLANK___CUT___ON___ONE___SIDE("Plank cut on one side"),
    @XmlEnumValue("Radial plank through pith")
    RADIAL___PLANK___THROUGH___PITH("Radial plank through pith"),
    @XmlEnumValue("Radial plank up to pith")
    RADIAL___PLANK___UP___TO___PITH("Radial plank up to pith"),
    @XmlEnumValue("Tangential plank not including pith with breadth larger than a quarter section")
    TANGENTIAL___PLANK___NOT___INCLUDING___PITH___WITH___BREADTH___LARGER___THAN___A___QUARTER___SECTION("Tangential plank not including pith with breadth larger than a quarter section"),
    @XmlEnumValue("Plank not including pith with breadth smaller than a quarter section")
    PLANK___NOT___INCLUDING___PITH___WITH___BREADTH___SMALLER___THAN___A___QUARTER___SECTION("Plank not including pith with breadth smaller than a quarter section"),
    @XmlEnumValue("Small part of section")
    SMALL___PART___OF___SECTION("Small part of section"),
    @XmlEnumValue("Part of undetermined section")
    PART___OF___UNDETERMINED___SECTION("Part of undetermined section"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    NormalTridasShape(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalTridasShape fromValue(String v) {
        for (NormalTridasShape c: NormalTridasShape.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
