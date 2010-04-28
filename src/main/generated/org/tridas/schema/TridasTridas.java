
package org.tridas.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}project" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}vocabulary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "projects",
    "vocabulary"
})
@XmlRootElement(name = "tridas")
public class TridasTridas
    implements Serializable, CopyTo, Copyable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1001L;
    @XmlElement(name = "project")
    protected List<TridasProject> projects;
    protected TridasVocabulary vocabulary;

    /**
     * Gets the value of the projects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasProject }
     * 
     * 
     */
    public List<TridasProject> getProjects() {
        if (projects == null) {
            projects = new ArrayList<TridasProject>();
        }
        return this.projects;
    }

    public boolean isSetProjects() {
        return ((this.projects!= null)&&(!this.projects.isEmpty()));
    }

    public void unsetProjects() {
        this.projects = null;
    }

    /**
     * Gets the value of the vocabulary property.
     * 
     * @return
     *     possible object is
     *     {@link TridasVocabulary }
     *     
     */
    public TridasVocabulary getVocabulary() {
        return vocabulary;
    }

    /**
     * Sets the value of the vocabulary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TridasVocabulary }
     *     
     */
    public void setVocabulary(TridasVocabulary value) {
        this.vocabulary = value;
    }

    public boolean isSetVocabulary() {
        return (this.vocabulary!= null);
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            List<TridasProject> theProjects;
            theProjects = this.getProjects();
            toStringBuilder.append("projects", theProjects);
        }
        {
            TridasVocabulary theVocabulary;
            theVocabulary = this.getVocabulary();
            toStringBuilder.append("vocabulary", theVocabulary);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof TridasTridas)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final TridasTridas that = ((TridasTridas) object);
        equalsBuilder.append(this.getProjects(), that.getProjects());
        equalsBuilder.append(this.getVocabulary(), that.getVocabulary());
    }

    public boolean equals(Object object) {
        if (!(object instanceof TridasTridas)) {
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
        hashCodeBuilder.append(this.getProjects());
        hashCodeBuilder.append(this.getVocabulary());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final TridasTridas copy = ((target == null)?((TridasTridas) createCopy()):((TridasTridas) target));
        if (this.isSetProjects()) {
            List<TridasProject> sourceProjects;
            sourceProjects = this.getProjects();
            @SuppressWarnings("unchecked")
            List<TridasProject> copyProjects = ((List<TridasProject> ) copyBuilder.copy(sourceProjects));
            copy.unsetProjects();
            List<TridasProject> uniqueProjectsl = copy.getProjects();
            uniqueProjectsl.addAll(copyProjects);
        } else {
            copy.unsetProjects();
        }
        if (this.isSetVocabulary()) {
            TridasVocabulary sourceVocabulary;
            sourceVocabulary = this.getVocabulary();
            TridasVocabulary copyVocabulary = ((TridasVocabulary) copyBuilder.copy(sourceVocabulary));
            copy.setVocabulary(copyVocabulary);
        } else {
            copy.vocabulary = null;
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new TridasTridas();
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param projects
     *     allowed object is
     *     {@link TridasProject }
     *     
     */
    public void setProjects(List<TridasProject> projects) {
        this.projects = projects;
    }

}
