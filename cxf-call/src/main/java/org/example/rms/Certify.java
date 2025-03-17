
package org.example.rms;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         <element name="requestParams" type="{http://microsoft.com/DRM/CertificationService}CertifyParams" minOccurs="0"/>
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
    "requestParams"
})
@XmlRootElement(name = "Certify")
public class Certify {

    protected CertifyParams requestParams;

    /**
     * 获取requestParams属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertifyParams }
     *     
     */
    public CertifyParams getRequestParams() {
        return requestParams;
    }

    /**
     * 设置requestParams属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertifyParams }
     *     
     */
    public void setRequestParams(CertifyParams value) {
        this.requestParams = value;
    }

}
