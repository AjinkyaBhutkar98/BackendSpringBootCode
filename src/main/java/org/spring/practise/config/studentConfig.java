package org.spring.practise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.practise.config")
public class studentConfig {

//    @Bean(name="student1")
//    public String studentName(){
//        return "John Wick";
//    }

    @Bean
    public Student student(){
        return new Student("John Wick");
    }
}
