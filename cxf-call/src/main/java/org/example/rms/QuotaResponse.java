
package org.example.rms;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>QuotaResponse complex type的 Java 类。</p>
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。</p>
 * 
 * <pre>{@code
 * <complexType name="QuotaResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Verified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CurrentConsumption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaResponse", propOrder = {
    "verified",
    "currentConsumption",
    "maximum"
})
public class QuotaResponse {

    @XmlElement(name = "Verified")
    protected boolean verified;
    @XmlElement(name = "CurrentConsumption")
    protected int currentConsumption;
    @XmlElement(name = "Maximum")
    protected int maximum;

    /**
     * 获取verified属性的值。
     * 
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * 设置verified属性的值。
     * 
     */
    public void setVerified(boolean value) {
        this.verified = value;
    }

    /**
     * 获取currentConsumption属性的值。
     * 
     */
    public int getCurrentConsumption() {
        return currentConsumption;
    }

    /**
     * 设置currentConsumption属性的值。
     * 
     */
    public void setCurrentConsumption(int value) {
        this.currentConsumption = value;
    }

    /**
     * 获取maximum属性的值。
     * 
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * 设置maximum属性的值。
     * 
     */
    public void setMaximum(int value) {
        this.maximum = value;
    }

}
