package org.spring.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
