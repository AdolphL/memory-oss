package com.adolph.memory.config;

import com.adolph.memory.aop.RequestLogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
public class WebMvcConfigure {

    public void interceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestLogInterceptor()).addPathPatterns("/**");
    }

}
