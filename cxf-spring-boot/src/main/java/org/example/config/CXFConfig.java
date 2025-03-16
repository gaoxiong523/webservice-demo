package org.example.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.example.service.impl.DeptInfoWSServiceImpl;
import org.example.service.impl.HelloServiceImpl;
import org.example.service.impl.UserInfoWSServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CXFConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private HelloServiceImpl helloService;

    @Autowired
    private UserInfoWSServiceImpl userInfoWSService;

    @Autowired
    private DeptInfoWSServiceImpl deptInfoWSService;

    @Bean
    public Endpoint helloServer() {
        EndpointImpl endpoint  = new EndpointImpl(bus, helloService);
        endpoint.publish("/hello");
        return endpoint;
    }

    @Bean
    public Endpoint userInfo() {
        EndpointImpl endpoint  = new EndpointImpl(bus, userInfoWSService);
        endpoint.publish("/userInfo");
        return endpoint;
    }

    @Bean
    public Endpoint deptInfo() {
        EndpointImpl endpoint  = new EndpointImpl(bus, deptInfoWSService);
        endpoint.publish("/deptInfo");
        return endpoint;
    }
}
