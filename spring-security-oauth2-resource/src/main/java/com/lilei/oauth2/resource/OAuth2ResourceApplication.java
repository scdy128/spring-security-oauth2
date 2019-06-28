package com.lilei.oauth2.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName OAuth2ResourceApplication
 * @Description TODO
 * @Author LiLei
 * @Date 2019/6/14 14:48
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.lilei.oauth2.resource.mapper")
public class OAuth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class,args);
    }

}
