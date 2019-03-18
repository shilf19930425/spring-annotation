package com.study.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.study.bean.Person;

@Configuration
@ComponentScan(value = "com.study")
public class MainConfig
{
	public static void main(String[] args)
	{
		ApplicationContext applContext = new AnnotationConfigApplicationContext(Person.class);
	}
}
