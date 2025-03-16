package org.example.service.impl;

import org.example.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Service
public class HelloServiceImpl  implements HelloService {


    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(@WebParam (name = "name") String name) {
        return String.format("Hello springboot  %s", name);
    }
}
