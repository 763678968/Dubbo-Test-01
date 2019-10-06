package com.example.gmall;


import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 1.导入依赖
 *      1）导入dubbo-starter
 *      2）导入dubbo的其他依赖
 *
 * SpringBoot与dubbo整合的三种方式：
 *      1）导入dubbo-starter，在application.properties中配置属性，使用@Service【暴露服务】，使用@Reference【引用服务】
 *      2）保留dubbo xml配置文件，导入dubbo-starter，使用@ImportRresource导入dubbo的配置文件即可
 *      3) 使用注解API的方式：将每一个组件手动创建到容器中
 */

@EnableDubbo //开启基于注解的dubbo功能
//@ImportResource(locations = "classpath:provider.xml")
//@EnableDubbo(scanBasePackages = "com.example.gmall")
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
