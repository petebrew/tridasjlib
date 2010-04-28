
package net.opengis.gml.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *             A MultiPoint is defined by one or more Points, referenced
 *             through pointMember elements.
 *          
 * 
 * <p>Java class for MultiPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}pointMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointType", propOrder = {
    "pointMembers"
})
public class MultiPointType
    extends AbstractGeometricAggregateType
    implements Serializable, CopyTo, Copyable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1001L;
    @XmlElement(name = "pointMember")
    protected List<PointMember> pointMembers;

    /**
     * Gets the value of the pointMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointMember }
     * 
     * 
     */
    public List<PointMember> getPointMembers() {
        if (pointMembers == null) {
            pointMembers = new ArrayList<PointMember>();
        }
        return this.pointMembers;
    }

    public boolean isSetPointMembers() {
        return ((this.pointMembers!= null)&&(!this.pointMembers.isEmpty()));
    }

    public void unsetPointMembers() {
        this.pointMembers = null;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<PointMember> thePointMembers;
            thePointMembers = this.getPointMembers();
            toStringBuilder.append("pointMembers", thePointMembers);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MultiPointType)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final MultiPointType that = ((MultiPointType) object);
        equalsBuilder.append(this.getPointMembers(), that.getPointMembers());
    }

    public boolean equals(Object object) {
        if (!(object instanceof MultiPointType)) {
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
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.getPointMembers());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final MultiPointType copy = ((target == null)?((MultiPointType) createCopy()):((MultiPointType) target));
        super.copyTo(copy, copyBuilder);
        if (this.isSetPointMembers()) {
            List<PointMember> sourcePointMembers;
            sourcePointMembers = this.getPointMembers();
            @SuppressWarnings("unchecked")
            List<PointMember> copyPointMembers = ((List<PointMember> ) copyBuilder.copy(sourcePointMembers));
            copy.unsetPointMembers();
            List<PointMember> uniquePointMembersl = copy.getPointMembers();
            uniquePointMembersl.addAll(copyPointMembers);
        } else {
            copy.unsetPointMembers();
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new MultiPointType();
    }

    /**
     * Sets the value of the pointMembers property.
     * 
     * @param pointMembers
     *     allowed object is
     *     {@link PointMember }
     *     
     */
    public void setPointMembers(List<PointMember> pointMembers) {
        this.pointMembers = pointMembers;
    }

}
