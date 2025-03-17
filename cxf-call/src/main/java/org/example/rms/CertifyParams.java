
package org.example.rms;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>CertifyParams complex type的 Java 类。</p>
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。</p>
 * 
 * <pre>{@code
 * <complexType name="CertifyParams">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MachineCertificateChain" type="{http://microsoft.com/DRM/CertificationService}ArrayOfXmlNode" minOccurs="0"/>
 *         <element name="Persistent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifyParams", propOrder = {
    "machineCertificateChain",
    "persistent"
})
public class CertifyParams {

    @XmlElement(name = "MachineCertificateChain")
    protected ArrayOfXmlNode machineCertificateChain;
    @XmlElement(name = "Persistent")
    protected boolean persistent;

    /**
     * 获取machineCertificateChain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXmlNode }
     *     
     */
    public ArrayOfXmlNode getMachineCertificateChain() {
        return machineCertificateChain;
    }

    /**
     * 设置machineCertificateChain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXmlNode }
     *     
     */
    public void setMachineCertificateChain(ArrayOfXmlNode value) {
        this.machineCertificateChain = value;
    }

    /**
     * 获取persistent属性的值。
     * 
     */
    public boolean isPersistent() {
        return persistent;
    }

    /**
     * 设置persistent属性的值。
     * 
     */
    public void setPersistent(boolean value) {
        this.persistent = value;
    }

}
