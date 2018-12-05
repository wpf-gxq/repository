package com.cssl.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.cssl.web.MyInterceptor;

@Component
public class MyMvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 添加拦截器
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
	
	

}
