package com.study.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//4种方式给bean添加初始化和销毁的方法
//  1）通过@Bean的init-method 和 destory-method指定
//  2）让Bean实现InitializingBean和DisposableBean 接口来定义初始化和销毁方法
//  3) 在Bean的方法上添加@PostConstruct或@PreDestroy来指定初始化和销毁方法
//  4）让Bean实现BeanPostProcessor接口里面的
//        postProcessBeforeInitialization:初始化之前
//        postProcessAfterInitialization:初始化之后
public class MainConfigOfLifeCycle implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    // TODO 自动生成的方法存根
    return null;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    // TODO 自动生成的方法存根
    return null;
  }

  @Override
  public String toString() {
    return "MainConfigOfLifeCycle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
      + super.toString() + "]";
  }
}
