package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.cssl.dao")
@ServletComponentScan("com.cssl.web")
@SpringBootApplication
public class DemoApp {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}

}
