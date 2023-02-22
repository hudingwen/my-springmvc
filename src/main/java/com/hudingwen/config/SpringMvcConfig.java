package com.hudingwen.config;

import com.hudingwen.controller.handler.ProjectInterceptorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * ClassName:SpringMvcConfig
 * Package:com.hudingwen.config
 * Description:描述
 * Date:2022-10-03 15:08:25
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@Configuration
@ComponentScan("com.hudingwen.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    ProjectInterceptorHandler projectInterceptorHandler;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加SpringMvc拦截器
        registry.addInterceptor(projectInterceptorHandler).addPathPatterns("/book","/book/*");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //静态资源访问
        registry.addResourceHandler("/user/**").addResourceLocations("/user/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
