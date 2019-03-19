package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.study.bean.Person;

@Configuration
@ComponentScan(value = "com.study")
public class MainConfig {
  // @Bean相当于声明一个 id 为person的bean，如果没有括号，则bean的ID为getPerson
  @Bean("person")
  public Person getPerson() {
    return new Person();
  }
}
