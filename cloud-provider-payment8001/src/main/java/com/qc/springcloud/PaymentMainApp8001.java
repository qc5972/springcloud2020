package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qc
 * @create 2020-03-05 21:50
 */
@SpringBootApplication
@EnableDiscoveryClient//启动服务发现
public class PaymentMainApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApp8001.class,args);
    }
}
