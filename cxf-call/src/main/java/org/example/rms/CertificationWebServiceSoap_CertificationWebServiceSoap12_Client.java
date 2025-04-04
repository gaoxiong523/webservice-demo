
package org.example.rms;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;


/**
 * This class was generated by Apache CXF 4.1.1
 * 2025-03-17T17:06:51.850+08:00
 * Generated source version: 4.1.1
 *
 */
public final class CertificationWebServiceSoap_CertificationWebServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://microsoft.com/DRM/CertificationService", "CertificationWebService");

    private CertificationWebServiceSoap_CertificationWebServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CertificationWebService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CertificationWebService ss = new CertificationWebService(wsdlURL, SERVICE_NAME);
        CertificationWebServiceSoap port = ss.getCertificationWebServiceSoap12();

        {
        System.out.println("Invoking certify...");
        org.example.rms.CertifyParams _certify_requestParams = null;
        org.example.rms.CertifyResponse2 _certify__return = port.certify(_certify_requestParams);
        System.out.println("certify.result=" + _certify__return);


        }

        System.exit(0);
    }

}
