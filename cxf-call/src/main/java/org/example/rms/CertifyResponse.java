
package org.example.rms;


import javax.xml.bind.annotation.*;

/**
 * <p>anonymous complex type的 Java 类。</p>
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertifyResult" type="{http://microsoft.com/DRM/CertificationService}CertifyResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "certifyResult"
})
@XmlRootElement(name = "CertifyResponse")
public class CertifyResponse {

    @XmlElement(name = "CertifyResult")
    protected CertifyResponse2 certifyResult;

    /**
     * 获取certifyResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertifyResponse2 }
     *     
     */
    public CertifyResponse2 getCertifyResult() {
        return certifyResult;
    }

    /**
     * 设置certifyResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertifyResponse2 }
     *     
     */
    public void setCertifyResult(CertifyResponse2 value) {
        this.certifyResult = value;
    }

}
