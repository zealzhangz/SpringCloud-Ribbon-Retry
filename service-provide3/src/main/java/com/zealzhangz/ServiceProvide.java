package com.zealzhangz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Created by zhanga/tenderfacepalm@163.com.<br/>
 * @version Version: 1.0
 * @date DateTime: 2018/10/10 21:17:00<br/>
 */
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class ServiceProvide {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProvide.class,args);
    }
}
