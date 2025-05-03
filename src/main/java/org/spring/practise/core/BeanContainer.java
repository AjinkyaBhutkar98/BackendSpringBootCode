package org.spring.practise.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//to pass single package
//@ComponentScan(basePackages = "org.spring.practise")
//to pass multiple packages
@ComponentScan(basePackages = {"org.spring.practise.core","org.spring.practise.config"})
public class BeanContainer {


    @Bean(name="empIdBean")
    public int empId(){

        return 1;
    }

    @Bean(name="empNameBean")
    public String empName(){
        return "Mac Doe";
    }

    @Bean(name="emptaskNameBean")
    public String taskName(){

        return "make objects";
    }

}
