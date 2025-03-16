package org.example;

import org.example.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class WSPublisher {
    public static void main(String[] args) {
        String address = "http://localhost:8888/ws";
        HelloServiceImpl service = new HelloServiceImpl();
        Endpoint.publish(address, service);
        System.out.println("Web Service published at " + address);
    }
}
