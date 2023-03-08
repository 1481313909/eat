package com.eat;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

//"com.guomen.rzpx.rzpx.model.dao","com.guomen.rzpx.fd.dto.domain","com.guomen.rzpx.fd.model.dao","com.guomen.rzpx.fd.dto.dao","com.guomen.rzpx.fd.dto.mapper","com.guomen.rzpx.process.dto.domain","com.guomen.rzpx.process.model.dao","com.guomen.rzpx.process.dto.dao","com.guomen.rzpx.process.dto.mapper"
@MapperScan(value = {"com.eat.domain","com.eat.mapper","com.eat.service"})
@EnableConfigurationProperties({ ServerProperties.class})
public class EatApplication {
    public static void main(String[] args) {
        System.out.println("--------------版本：eat 2023");

        SpringApplication.run(EatApplication.class, args);
    }

}
