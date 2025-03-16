package org.example;

import org.example.wsdl.HelloServiceImpl;
import org.example.wsdl.HelloServiceImplService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HelloServiceImplService service = new HelloServiceImplService();
        HelloServiceImpl serviceImplPort = service.getHelloServiceImplPort();
        String var = serviceImplPort.sayHello("张三");
        System.out.println(var);
    }
}