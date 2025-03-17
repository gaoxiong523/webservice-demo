
package org.example.rms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.rms package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _VersionData_QNAME = new QName("http://microsoft.com/DRM/CertificationService", "VersionData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.rms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfXmlNode }
     * 
     * @return
     *     the new instance of {@link ArrayOfXmlNode }
     */
    public ArrayOfXmlNode createArrayOfXmlNode() {
        return new ArrayOfXmlNode();
    }

    /**
     * Create an instance of {@link Certify }
     * 
     * @return
     *     the new instance of {@link Certify }
     */
    public Certify createCertify() {
        return new Certify();
    }

    /**
     * Create an instance of {@link CertifyParams }
     * 
     * @return
     *     the new instance of {@link CertifyParams }
     */
    public CertifyParams createCertifyParams() {
        return new CertifyParams();
    }

    /**
     * Create an instance of {@link CertifyResponse }
     * 
     * @return
     *     the new instance of {@link CertifyResponse }
     */
    public CertifyResponse createCertifyResponse() {
        return new CertifyResponse();
    }

    /**
     * Create an instance of {@link CertifyResponse2 }
     * 
     * @return
     *     the new instance of {@link CertifyResponse2 }
     */
    public CertifyResponse2 createCertifyResponse2() {
        return new CertifyResponse2();
    }

    /**
     * Create an instance of {@link VersionData }
     * 
     * @return
     *     the new instance of {@link VersionData }
     */
    public VersionData createVersionData() {
        return new VersionData();
    }

    /**
     * Create an instance of {@link QuotaResponse }
     * 
     * @return
     *     the new instance of {@link QuotaResponse }
     */
    public QuotaResponse createQuotaResponse() {
        return new QuotaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfXmlNode.Certificate }
     * 
     * @return
     *     the new instance of {@link ArrayOfXmlNode.Certificate }
     */
    public ArrayOfXmlNode.Certificate createArrayOfXmlNodeCertificate() {
        return new ArrayOfXmlNode.Certificate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionData }{@code >}
     */
    @XmlElementDecl(namespace = "http://microsoft.com/DRM/CertificationService", name = "VersionData")
    public JAXBElement<VersionData> createVersionData(VersionData value) {
        return new JAXBElement<>(_VersionData_QNAME, VersionData.class, null, value);
    }

}
