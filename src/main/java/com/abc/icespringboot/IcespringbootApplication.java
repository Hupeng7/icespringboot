package com.abc.icespringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication

/**
 * 扫描Mapper包 为其创建代理对象
 */
@MapperScan(value = "com.abc.icespringboot.mapper")
/**
 * 使用定时任务注解
 */
@EnableScheduling
/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:40 2018/8/10 0010
 */
public class IcespringbootApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IcespringbootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(IcespringbootApplication.class, args);
    }
}
