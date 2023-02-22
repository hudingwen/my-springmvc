package com.hudingwen.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ClassName:SpringMvcConfig
 * Package:com.hudingwen.config
 * Description:描述
 * Date:2022-10-03 15:08:25
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@Configuration
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement
//方式一
@ComponentScan({"com.hudingwen.service","com.hudingwen.dao"})
//方式一
//@ComponentScan(value = "com.hudingwen",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,
//                classes = Controller.class
//        )
//)
public class SpringConfig {
}
