
package net.opengis.gml.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * 
 *             DirectPosition instances hold the coordinates for one position
 *             in the coordinate reference system (CRS) referenced in a 
 *             larger element. In this case, the CRS shall be assumed to be
 *             the value referenced in the containing object's CRS.
 *          
 * 
 * <p>Java class for DirectPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectPositionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>doubleList">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectPositionType", propOrder = {
    "values"
})
@XmlRootElement(name = "pos")
public class Pos
    implements Serializable, CopyTo, Copyable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1001L;
    @XmlValue
    protected List<Double> values;

    /**
     * 
     *             XML List based on XML Schema double type.  An element
     *             of this type contains a space-separated list of double
     *             values
     *          Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValues() {
        if (values == null) {
            values = new ArrayList<Double>();
        }
        return this.values;
    }

    public boolean isSetValues() {
        return ((this.values!= null)&&(!this.values.isEmpty()));
    }

    public void unsetValues() {
        this.values = null;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            List<Double> theValues;
            theValues = this.getValues();
            toStringBuilder.append("values", theValues);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof Pos)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final Pos that = ((Pos) object);
        equalsBuilder.append(this.getValues(), that.getValues());
    }

    public boolean equals(Object object) {
        if (!(object instanceof Pos)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getValues());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final Pos copy = ((target == null)?((Pos) createCopy()):((Pos) target));
        if (this.isSetValues()) {
            List<Double> sourceValues;
            sourceValues = this.getValues();
            @SuppressWarnings("unchecked")
            List<Double> copyValues = ((List<Double> ) copyBuilder.copy(sourceValues));
            copy.unsetValues();
            List<Double> uniqueValuesl = copy.getValues();
            uniqueValuesl.addAll(copyValues);
        } else {
            copy.unsetValues();
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new Pos();
    }

    /**
     * 
     *             XML List based on XML Schema double type.  An element
     *             of this type contains a space-separated list of double
     *             values
     *          
     * 
     * @param values
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValues(List<Double> values) {
        this.values = values;
    }

}
