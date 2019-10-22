package com.example.managerment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ServletComponentScan
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.example.managerment.repository.mapper")
public class ManagermentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagermentApplication.class, args);
    }

}
