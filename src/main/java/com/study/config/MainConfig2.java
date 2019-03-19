package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.study.bean.Person;
import com.study.condition.LinuxCondition;
import com.study.condition.WindowsCondition;

@Configuration
@ComponentScan(value = "com.study")
public class MainConfig2 {
  /**
   * singleton : 单实例（默认），在IOC容器创建的时候就被创建了，需要的时候就从IOC容器中获取
   * prototype ： 多实例，需要该对象的时候,IOC容器再进行创建，每次创建都是一个新的对象。
   * @return
   */
  //@Scope("singleton")
  //懒加载：只针对单实例，IOC容器启动的时候不创建对象，只有第一次获取对象的时候再将对象创建到IOC容器中。
  @Lazy
  // @Bean相当于声明一个 id 为person的bean，如果没有括号，则bean的ID为getPerson
  @Bean("person")
  public Person person01() {
    return new Person();
  }

  /**
   * @Conditional 对象加载的条件,可对类/方法
   * MyCondition01为自定义的加载条件，true加载，false不加载
   * @return
   */
  @Conditional({ WindowsCondition.class })
  @Bean("bill")
  public Person person02() {
    return new Person();
  }

  @Conditional({ LinuxCondition.class })
  @Bean("linus")
  public Person person03() {
    return new Person();
  }

}
