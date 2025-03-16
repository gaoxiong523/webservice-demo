package org.example.annotation;

import java.lang.annotation.*;

/**
 * 动态发布WS的自定义注解
 * @author gaoxiong
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoPublishWS {


    /**
     * 服务名称
     * @return
     */
    String serviceName();

    /**
     * 服务地址
     * @return
     */
    String publishPath() default "";
}
