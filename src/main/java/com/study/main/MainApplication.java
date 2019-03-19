package com.study.main;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.study.config.MainConfig;

public class MainApplication {
  ApplicationContext applContext = new AnnotationConfigApplicationContext(MainConfig.class);

  public void test01() {
    ApplicationContext applContext = new AnnotationConfigApplicationContext(MainConfig.class);
    String[] beanName = applContext.getBeanDefinitionNames();
    for (String name : beanName) {
      System.out.println(name);
    }
  }

  @Test
  public void test02() {
    Environment environment = applContext.getEnvironment();
    String property = environment.getProperty("os.name");
    System.out.println(property);
  }
}
