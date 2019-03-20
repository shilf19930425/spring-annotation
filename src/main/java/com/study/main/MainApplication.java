package com.study.main;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.study.config.MainConfig2;

public class MainApplication {
  ApplicationContext applContext = new AnnotationConfigApplicationContext(MainConfig2.class);

  public void test01() {
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

  @Test
  public void test03() {
    String[] beanDefinitionNames = applContext.getBeanDefinitionNames();
    for (String beanName : beanDefinitionNames) {
      System.out.println(beanName);
    }

  }
}
