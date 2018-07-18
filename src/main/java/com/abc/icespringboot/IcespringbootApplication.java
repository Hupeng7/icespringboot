package com.abc.icespringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan(value = "com.abc.icespringboot.mapper")
//扫描Mapper包 为其创建代理对象
public class IcespringbootApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IcespringbootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(IcespringbootApplication.class, args);
    }
}
