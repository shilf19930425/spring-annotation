package com.study.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

  /**
   * importingClassMetadata:当前类的注解信息
   * registry ： bean的注册类
   *    可以调用BeanDefinitionRegistry.registerBeanDefinition()方法将所有要注册的类注册进去。
   */
  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
    BeanDefinitionRegistry registry) {
    // TODO 自动生成的方法存根

  }

}
