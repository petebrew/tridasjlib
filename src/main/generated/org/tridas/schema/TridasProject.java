
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
import org.tridas.interfaces.ITridas;
import org.tridas.interfaces.ITridasGeneric;
import org.tridas.util.TridasObjectEx;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tridas.org/1.2.1}tridasEntity">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}type" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}file" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}laboratory" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}category"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}investigator"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}period"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}requestDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}commissioner" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}research" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}genericField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}object" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.tridas.org/1.2.1}derivedSeries" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "types",
    "description",
    "files",
    "laboratories",
    "category",
    "investigator",
    "period",
    "requestDate",
    "commissioner",
    "references",
    "researches",
    "genericFields",
    "objects",
    "derivedSeries"
})
@XmlRootElement(name = "project")
public class TridasProject
    extends TridasEntity
    implements Serializable, CopyTo, Copyable, Equals, HashCode, ToString, ITridas, ITridasGeneric
{

    private final static long serialVersionUID = 1001L;
    @XmlElement(name = "type", required = true)
    protected List<ControlledVoc> types;
    protected String description;
    @XmlElement(name = "file")
    protected List<TridasFile> files;
    @XmlElement(name = "laboratory", required = true)
    protected List<TridasLaboratory> laboratories;
    @XmlElement(required = true)
    protected TridasCategory category;
    @XmlElement(required = true)
    protected String investigator;
    @XmlElement(required = true)
    protected String period;
    protected Date requestDate;
    protected String commissioner;
    @XmlElement(name = "reference")
    protected List<String> references;
    @XmlElement(name = "research")
    protected List<TridasResearch> researches;
    @XmlElement(name = "genericField")
    protected List<TridasGenericField> genericFields;
    @XmlElement(name = "object", type = TridasObjectEx.class)
    protected List<TridasObject> objects;
    protected List<TridasDerivedSeries> derivedSeries;

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVoc }
     * 
     * 
     */
    public List<ControlledVoc> getTypes() {
        if (types == null) {
            types = new ArrayList<ControlledVoc>();
        }
        return this.types;
    }

    public boolean isSetTypes() {
        return ((this.types!= null)&&(!this.types.isEmpty()));
    }

    public void unsetTypes() {
        this.types = null;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasFile }
     * 
     * 
     */
    public List<TridasFile> getFiles() {
        if (files == null) {
            files = new ArrayList<TridasFile>();
        }
        return this.files;
    }

    public boolean isSetFiles() {
        return ((this.files!= null)&&(!this.files.isEmpty()));
    }

    public void unsetFiles() {
        this.files = null;
    }

    /**
     * Gets the value of the laboratories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laboratories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaboratories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasLaboratory }
     * 
     * 
     */
    public List<TridasLaboratory> getLaboratories() {
        if (laboratories == null) {
            laboratories = new ArrayList<TridasLaboratory>();
        }
        return this.laboratories;
    }

    public boolean isSetLaboratories() {
        return ((this.laboratories!= null)&&(!this.laboratories.isEmpty()));
    }

    public void unsetLaboratories() {
        this.laboratories = null;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TridasCategory }
     *     
     */
    public TridasCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link TridasCategory }
     *     
     */
    public void setCategory(TridasCategory value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the investigator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigator() {
        return investigator;
    }

    /**
     * Sets the value of the investigator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigator(String value) {
        this.investigator = value;
    }

    public boolean isSetInvestigator() {
        return (this.investigator!= null);
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRequestDate(Date value) {
        this.requestDate = value;
    }

    public boolean isSetRequestDate() {
        return (this.requestDate!= null);
    }

    /**
     * Gets the value of the commissioner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissioner() {
        return commissioner;
    }

    /**
     * Sets the value of the commissioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissioner(String value) {
        this.commissioner = value;
    }

    public boolean isSetCommissioner() {
        return (this.commissioner!= null);
    }

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferences() {
        if (references == null) {
            references = new ArrayList<String>();
        }
        return this.references;
    }

    public boolean isSetReferences() {
        return ((this.references!= null)&&(!this.references.isEmpty()));
    }

    public void unsetReferences() {
        this.references = null;
    }

    /**
     * Gets the value of the researches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the researches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResearches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasResearch }
     * 
     * 
     */
    public List<TridasResearch> getResearches() {
        if (researches == null) {
            researches = new ArrayList<TridasResearch>();
        }
        return this.researches;
    }

    public boolean isSetResearches() {
        return ((this.researches!= null)&&(!this.researches.isEmpty()));
    }

    public void unsetResearches() {
        this.researches = null;
    }

    /**
     * Gets the value of the genericFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasGenericField }
     * 
     * 
     */
    public List<TridasGenericField> getGenericFields() {
        if (genericFields == null) {
            genericFields = new ArrayList<TridasGenericField>();
        }
        return this.genericFields;
    }

    public boolean isSetGenericFields() {
        return ((this.genericFields!= null)&&(!this.genericFields.isEmpty()));
    }

    public void unsetGenericFields() {
        this.genericFields = null;
    }

    /**
     * Gets the value of the objects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasObject }
     * 
     * 
     */
    public List<TridasObject> getObjects() {
        if (objects == null) {
            objects = new ArrayList<TridasObject>();
        }
        return this.objects;
    }

    public boolean isSetObjects() {
        return ((this.objects!= null)&&(!this.objects.isEmpty()));
    }

    public void unsetObjects() {
        this.objects = null;
    }

    /**
     * Gets the value of the derivedSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TridasDerivedSeries }
     * 
     * 
     */
    public List<TridasDerivedSeries> getDerivedSeries() {
        if (derivedSeries == null) {
            derivedSeries = new ArrayList<TridasDerivedSeries>();
        }
        return this.derivedSeries;
    }

    public boolean isSetDerivedSeries() {
        return ((this.derivedSeries!= null)&&(!this.derivedSeries.isEmpty()));
    }

    public void unsetDerivedSeries() {
        this.derivedSeries = null;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<ControlledVoc> theTypes;
            theTypes = this.getTypes();
            toStringBuilder.append("types", theTypes);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            toStringBuilder.append("description", theDescription);
        }
        {
            List<TridasFile> theFiles;
            theFiles = this.getFiles();
            toStringBuilder.append("files", theFiles);
        }
        {
            List<TridasLaboratory> theLaboratories;
            theLaboratories = this.getLaboratories();
            toStringBuilder.append("laboratories", theLaboratories);
        }
        {
            TridasCategory theCategory;
            theCategory = this.getCategory();
            toStringBuilder.append("category", theCategory);
        }
        {
            String theInvestigator;
            theInvestigator = this.getInvestigator();
            toStringBuilder.append("investigator", theInvestigator);
        }
        {
            String thePeriod;
            thePeriod = this.getPeriod();
            toStringBuilder.append("period", thePeriod);
        }
        {
            Date theRequestDate;
            theRequestDate = this.getRequestDate();
            toStringBuilder.append("requestDate", theRequestDate);
        }
        {
            String theCommissioner;
            theCommissioner = this.getCommissioner();
            toStringBuilder.append("commissioner", theCommissioner);
        }
        {
            List<String> theReferences;
            theReferences = this.getReferences();
            toStringBuilder.append("references", theReferences);
        }
        {
            List<TridasResearch> theResearches;
            theResearches = this.getResearches();
            toStringBuilder.append("researches", theResearches);
        }
        {
            List<TridasGenericField> theGenericFields;
            theGenericFields = this.getGenericFields();
            toStringBuilder.append("genericFields", theGenericFields);
        }
        {
            List<TridasObject> theObjects;
            theObjects = this.getObjects();
            toStringBuilder.append("objects", theObjects);
        }
        {
            List<TridasDerivedSeries> theDerivedSeries;
            theDerivedSeries = this.getDerivedSeries();
            toStringBuilder.append("derivedSeries", theDerivedSeries);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof TridasProject)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final TridasProject that = ((TridasProject) object);
        equalsBuilder.append(this.getTypes(), that.getTypes());
        equalsBuilder.append(this.getDescription(), that.getDescription());
        equalsBuilder.append(this.getFiles(), that.getFiles());
        equalsBuilder.append(this.getLaboratories(), that.getLaboratories());
        equalsBuilder.append(this.getCategory(), that.getCategory());
        equalsBuilder.append(this.getInvestigator(), that.getInvestigator());
        equalsBuilder.append(this.getPeriod(), that.getPeriod());
        equalsBuilder.append(this.getRequestDate(), that.getRequestDate());
        equalsBuilder.append(this.getCommissioner(), that.getCommissioner());
        equalsBuilder.append(this.getReferences(), that.getReferences());
        equalsBuilder.append(this.getResearches(), that.getResearches());
        equalsBuilder.append(this.getGenericFields(), that.getGenericFields());
        equalsBuilder.append(this.getObjects(), that.getObjects());
        equalsBuilder.append(this.getDerivedSeries(), that.getDerivedSeries());
    }

    public boolean equals(Object object) {
        if (!(object instanceof TridasProject)) {
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
        hashCodeBuilder.append(this.getTypes());
        hashCodeBuilder.append(this.getDescription());
        hashCodeBuilder.append(this.getFiles());
        hashCodeBuilder.append(this.getLaboratories());
        hashCodeBuilder.append(this.getCategory());
        hashCodeBuilder.append(this.getInvestigator());
        hashCodeBuilder.append(this.getPeriod());
        hashCodeBuilder.append(this.getRequestDate());
        hashCodeBuilder.append(this.getCommissioner());
        hashCodeBuilder.append(this.getReferences());
        hashCodeBuilder.append(this.getResearches());
        hashCodeBuilder.append(this.getGenericFields());
        hashCodeBuilder.append(this.getObjects());
        hashCodeBuilder.append(this.getDerivedSeries());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final TridasProject copy = ((target == null)?((TridasProject) createCopy()):((TridasProject) target));
        super.copyTo(copy, copyBuilder);
        if (this.isSetTypes()) {
            List<ControlledVoc> sourceTypes;
            sourceTypes = this.getTypes();
            @SuppressWarnings("unchecked")
            List<ControlledVoc> copyTypes = ((List<ControlledVoc> ) copyBuilder.copy(sourceTypes));
            copy.unsetTypes();
            List<ControlledVoc> uniqueTypesl = copy.getTypes();
            uniqueTypesl.addAll(copyTypes);
        } else {
            copy.unsetTypes();
        }
        if (this.isSetDescription()) {
            String sourceDescription;
            sourceDescription = this.getDescription();
            String copyDescription = ((String) copyBuilder.copy(sourceDescription));
            copy.setDescription(copyDescription);
        } else {
            copy.description = null;
        }
        if (this.isSetFiles()) {
            List<TridasFile> sourceFiles;
            sourceFiles = this.getFiles();
            @SuppressWarnings("unchecked")
            List<TridasFile> copyFiles = ((List<TridasFile> ) copyBuilder.copy(sourceFiles));
            copy.unsetFiles();
            List<TridasFile> uniqueFilesl = copy.getFiles();
            uniqueFilesl.addAll(copyFiles);
        } else {
            copy.unsetFiles();
        }
        if (this.isSetLaboratories()) {
            List<TridasLaboratory> sourceLaboratories;
            sourceLaboratories = this.getLaboratories();
            @SuppressWarnings("unchecked")
            List<TridasLaboratory> copyLaboratories = ((List<TridasLaboratory> ) copyBuilder.copy(sourceLaboratories));
            copy.unsetLaboratories();
            List<TridasLaboratory> uniqueLaboratoriesl = copy.getLaboratories();
            uniqueLaboratoriesl.addAll(copyLaboratories);
        } else {
            copy.unsetLaboratories();
        }
        if (this.isSetCategory()) {
            TridasCategory sourceCategory;
            sourceCategory = this.getCategory();
            TridasCategory copyCategory = ((TridasCategory) copyBuilder.copy(sourceCategory));
            copy.setCategory(copyCategory);
        } else {
            copy.category = null;
        }
        if (this.isSetInvestigator()) {
            String sourceInvestigator;
            sourceInvestigator = this.getInvestigator();
            String copyInvestigator = ((String) copyBuilder.copy(sourceInvestigator));
            copy.setInvestigator(copyInvestigator);
        } else {
            copy.investigator = null;
        }
        if (this.isSetPeriod()) {
            String sourcePeriod;
            sourcePeriod = this.getPeriod();
            String copyPeriod = ((String) copyBuilder.copy(sourcePeriod));
            copy.setPeriod(copyPeriod);
        } else {
            copy.period = null;
        }
        if (this.isSetRequestDate()) {
            Date sourceRequestDate;
            sourceRequestDate = this.getRequestDate();
            Date copyRequestDate = ((Date) copyBuilder.copy(sourceRequestDate));
            copy.setRequestDate(copyRequestDate);
        } else {
            copy.requestDate = null;
        }
        if (this.isSetCommissioner()) {
            String sourceCommissioner;
            sourceCommissioner = this.getCommissioner();
            String copyCommissioner = ((String) copyBuilder.copy(sourceCommissioner));
            copy.setCommissioner(copyCommissioner);
        } else {
            copy.commissioner = null;
        }
        if (this.isSetReferences()) {
            List<String> sourceReferences;
            sourceReferences = this.getReferences();
            @SuppressWarnings("unchecked")
            List<String> copyReferences = ((List<String> ) copyBuilder.copy(sourceReferences));
            copy.unsetReferences();
            List<String> uniqueReferencesl = copy.getReferences();
            uniqueReferencesl.addAll(copyReferences);
        } else {
            copy.unsetReferences();
        }
        if (this.isSetResearches()) {
            List<TridasResearch> sourceResearches;
            sourceResearches = this.getResearches();
            @SuppressWarnings("unchecked")
            List<TridasResearch> copyResearches = ((List<TridasResearch> ) copyBuilder.copy(sourceResearches));
            copy.unsetResearches();
            List<TridasResearch> uniqueResearchesl = copy.getResearches();
            uniqueResearchesl.addAll(copyResearches);
        } else {
            copy.unsetResearches();
        }
        if (this.isSetGenericFields()) {
            List<TridasGenericField> sourceGenericFields;
            sourceGenericFields = this.getGenericFields();
            @SuppressWarnings("unchecked")
            List<TridasGenericField> copyGenericFields = ((List<TridasGenericField> ) copyBuilder.copy(sourceGenericFields));
            copy.unsetGenericFields();
            List<TridasGenericField> uniqueGenericFieldsl = copy.getGenericFields();
            uniqueGenericFieldsl.addAll(copyGenericFields);
        } else {
            copy.unsetGenericFields();
        }
        if (this.isSetObjects()) {
            List<TridasObject> sourceObjects;
            sourceObjects = this.getObjects();
            @SuppressWarnings("unchecked")
            List<TridasObject> copyObjects = ((List<TridasObject> ) copyBuilder.copy(sourceObjects));
            copy.unsetObjects();
            List<TridasObject> uniqueObjectsl = copy.getObjects();
            uniqueObjectsl.addAll(copyObjects);
        } else {
            copy.unsetObjects();
        }
        if (this.isSetDerivedSeries()) {
            List<TridasDerivedSeries> sourceDerivedSeries;
            sourceDerivedSeries = this.getDerivedSeries();
            @SuppressWarnings("unchecked")
            List<TridasDerivedSeries> copyDerivedSeries = ((List<TridasDerivedSeries> ) copyBuilder.copy(sourceDerivedSeries));
            copy.unsetDerivedSeries();
            List<TridasDerivedSeries> uniqueDerivedSeriesl = copy.getDerivedSeries();
            uniqueDerivedSeriesl.addAll(copyDerivedSeries);
        } else {
            copy.unsetDerivedSeries();
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new TridasProject();
    }

    /**
     * Sets the value of the types property.
     * 
     * @param types
     *     allowed object is
     *     {@link ControlledVoc }
     *     
     */
    public void setTypes(List<ControlledVoc> types) {
        this.types = types;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param files
     *     allowed object is
     *     {@link TridasFile }
     *     
     */
    public void setFiles(List<TridasFile> files) {
        this.files = files;
    }

    /**
     * Sets the value of the laboratories property.
     * 
     * @param laboratories
     *     allowed object is
     *     {@link TridasLaboratory }
     *     
     */
    public void setLaboratories(List<TridasLaboratory> laboratories) {
        this.laboratories = laboratories;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param references
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(List<String> references) {
        this.references = references;
    }

    /**
     * Sets the value of the researches property.
     * 
     * @param researches
     *     allowed object is
     *     {@link TridasResearch }
     *     
     */
    public void setResearches(List<TridasResearch> researches) {
        this.researches = researches;
    }

    /**
     * Sets the value of the genericFields property.
     * 
     * @param genericFields
     *     allowed object is
     *     {@link TridasGenericField }
     *     
     */
    public void setGenericFields(List<TridasGenericField> genericFields) {
        this.genericFields = genericFields;
    }

    /**
     * Sets the value of the objects property.
     * 
     * @param objects
     *     allowed object is
     *     {@link TridasObject }
     *     
     */
    public void setObjects(List<TridasObject> objects) {
        this.objects = objects;
    }

    /**
     * Sets the value of the derivedSeries property.
     * 
     * @param derivedSeries
     *     allowed object is
     *     {@link TridasDerivedSeries }
     *     
     */
    public void setDerivedSeries(List<TridasDerivedSeries> derivedSeries) {
        this.derivedSeries = derivedSeries;
    }

}
