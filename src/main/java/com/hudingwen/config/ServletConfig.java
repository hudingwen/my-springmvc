package com.hudingwen.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//簡化版本
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        //spring容器
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        //springmvc容器
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        //Spring路由配置接管
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        //处理表单提交中文乱码问题
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceRequestEncoding(true);
        filter.setForceEncoding(true);
        return new Filter[]{filter};
    }
}

//原始版本
///**
// * ClassName:ServletContainersInitConfig
// * Package:com.hudingwen.config
// * Description:描述
// * Date:2022-10-03 15:20:44
// * Author:胡丁文
// * E-mail:admin@aiwanyun.cn
// **/
//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//    protected WebApplicationContext createServletApplicationContext() {
//        //加载SpringMvc对应的容器对象
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//    protected String[] getServletMappings() {
//        //配置请求是由tomcat处理还是SpringMvc处理
//        return new String[]{"/"};//代表所有请求都归SpriMvc处理
//    }
//    protected WebApplicationContext createRootApplicationContext() {
//        //加载Spring对应配置的容器对象
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
//        return ctx;
//    }
//}
