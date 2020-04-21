package com.mr.music1.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("regLogin");
        registry.addViewController("/user/regLogin.ftl").setViewName("regLogin");
    }
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截的请求，并排除几个不拦截的请求
        //  registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**")
        //       .excludePathPatterns("/favicon.ico","/regLogin","/regLogin.ftl","/user/**","/js/**","/jquery-easyui-1.6.10/**","/img/**","/music/**");
    }
}
