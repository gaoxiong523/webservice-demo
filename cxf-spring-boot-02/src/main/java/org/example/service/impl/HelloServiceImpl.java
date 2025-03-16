package org.example.service.impl;

import org.example.annotation.AutoPublishWS;
import org.example.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@Service
@WebService
@AutoPublishWS(serviceName = "helloService", publishPath = "/hello")
public class HelloServiceImpl  implements HelloService {
    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(String name) {
        return String.format("自动发布的 Hello springboot  %s", name);
    }
}
