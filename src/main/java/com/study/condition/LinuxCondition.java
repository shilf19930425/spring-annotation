package com.study.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
  /**
   * context : 添加该注解的上下文环境
   * AnnotatedTypeMetadata ：注释信息
   */
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    // TODO 自动生成的方法存根
    //获取ioc的beanfactory信息
    ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
    //获取类加载器
    ClassLoader classLoader = context.getClassLoader();
    //获取当前运行的环境
    Environment environment = context.getEnvironment();
    //获取bean定义的注册类
    BeanDefinitionRegistry registry = context.getRegistry();
    //获取操作系统
    String property = environment.getProperty("os.name");
    if (property.contains("linux")) {
      return true;
    }
    return false;
  }

}
