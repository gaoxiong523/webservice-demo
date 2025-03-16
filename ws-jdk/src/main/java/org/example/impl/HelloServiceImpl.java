package org.example.impl;

import org.example.HelloService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class HelloServiceImpl  implements HelloService {


    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(@WebParam (name = "name") String name) {
        return String.format("Hello %s", name);
    }
}
