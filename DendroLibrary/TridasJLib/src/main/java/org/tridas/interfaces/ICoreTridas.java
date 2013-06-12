package org.tridas.interfaces;

import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.tridas.schema.DateTime;
import org.tridas.schema.TridasIdentifier;

public interface ICoreTridas extends CopyTo, TridasIdentifiable {
   

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link TridasIdentifier }
     *     
     */
    // set in TridasIdentifiable
    //public TridasIdentifier getIdentifier();

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TridasIdentifier }
     *     
     */
    public void setIdentifier(TridasIdentifier value);

    public boolean isSetIdentifier();
    
   
}
