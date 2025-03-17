
package org.example.rms;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>CertifyResponse complex type的 Java 类。</p>
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。</p>
 * 
 * <pre>{@code
 * <complexType name="CertifyResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertificateChain" type="{http://microsoft.com/DRM/CertificationService}ArrayOfXmlNode" minOccurs="0"/>
 *         <element name="Quota" type="{http://microsoft.com/DRM/CertificationService}QuotaResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifyResponse", propOrder = {
    "certificateChain",
    "quota"
})
public class CertifyResponse2 {

    @XmlElement(name = "CertificateChain")
    protected ArrayOfXmlNode certificateChain;
    @XmlElement(name = "Quota")
    protected QuotaResponse quota;

    /**
     * 获取certificateChain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXmlNode }
     *     
     */
    public ArrayOfXmlNode getCertificateChain() {
        return certificateChain;
    }

    /**
     * 设置certificateChain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXmlNode }
     *     
     */
    public void setCertificateChain(ArrayOfXmlNode value) {
        this.certificateChain = value;
    }

    /**
     * 获取quota属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuotaResponse }
     *     
     */
    public QuotaResponse getQuota() {
        return quota;
    }

    /**
     * 设置quota属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaResponse }
     *     
     */
    public void setQuota(QuotaResponse value) {
        this.quota = value;
    }

}
