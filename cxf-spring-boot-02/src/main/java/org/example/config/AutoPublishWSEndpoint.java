package org.example.config;


import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.example.annotation.AutoPublishWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AutoPublishWSEndpoint implements ApplicationRunner {

    @Autowired
    private Bus bus;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
      log.info("AutoPublishWSEndpoint===执行了");
      applicationContext.getBeansWithAnnotation(AutoPublishWS.class).forEach((beanName, bean) -> {
          log.info("AutoPublishWSEndpoint===beanName:{}", beanName);
          log.info("AutoPublishWSEndpoint===bean:{}", bean);
          log.info("AutoPublishWSEndpoint===bean.getClass():{}", bean.getClass());
          AutoPublishWS annotation = applicationContext.getType(beanName).getAnnotation(AutoPublishWS.class);
          String publishPath = annotation.publishPath();
          String serviceName = annotation.serviceName();
          EndpointImpl endpoint = new EndpointImpl(bus, bean);
          endpoint.publish(publishPath);

          log.info("AutoPublishWSEndpoint===发布服务:{}", serviceName);
      });
    }
}
