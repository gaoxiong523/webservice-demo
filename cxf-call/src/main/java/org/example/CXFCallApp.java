package org.example;

import org.example.wsdl.HelloServiceImpl;
import org.example.wsdl.HelloServiceImplService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CXFCallApp {
    public static void main(String[] args) {
        HelloServiceImpl serviceImplPort = new HelloServiceImplService().getHelloServiceImplPort();
        System.out.println(serviceImplPort.sayHello("张三"));
    }
}