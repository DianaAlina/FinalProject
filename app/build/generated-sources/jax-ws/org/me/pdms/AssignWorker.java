
package org.me.pdms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignWorker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignWorker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stageID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignWorker", propOrder = {
    "stageID",
    "workerID"
})
public class AssignWorker {

    protected int stageID;
    protected int workerID;

    /**
     * Gets the value of the stageID property.
     * 
     */
    public int getStageID() {
        return stageID;
    }

    /**
     * Sets the value of the stageID property.
     * 
     */
    public void setStageID(int value) {
        this.stageID = value;
    }

    /**
     * Gets the value of the workerID property.
     * 
     */
    public int getWorkerID() {
        return workerID;
    }

    /**
     * Sets the value of the workerID property.
     * 
     */
    public void setWorkerID(int value) {
        this.workerID = value;
    }

}
