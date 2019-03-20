package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import com.study.bean.Blue;
import com.study.bean.Person;
import com.study.bean.Red;
import com.study.condition.LinuxCondition;
import com.study.condition.WindowsCondition;
import com.study.factory.ColorFactory;

@Configuration
//FilterType.ASSIGNABLE_TYPE  按照类型
//FilterType。ANNOTATION  按照注解的类型
//FilterType.CUSTOM 自定义类型
@ComponentScans(value = {
  @ComponentScan(value = "com.study"/*, includeFilters = {
                                    @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { Person.class }) }, useDefaultFilters = false*/) })
@Import({ Red.class, Blue.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class })
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

  /**
   * 给IOC容器中注册组件
   * 1、包扫描+注解（@Service,@Repository,@Component,@Controller）注册
   * 2、@Bean()  (导入第三方组件，就是return new 一个新对象)
   * 3、@Import() [快速导入组件]
   *    1) @Import(要导入的组件) 在IOC中默认的ID为全类名
   *    2) ImportSelector 自定义加载类,要实现ImportSelector接口,返回一个全类名的String[]数组，
   *    3) ImportBeanDefinitionRegistrar   手工注册，实现ImportBeanDefinitionRegistrar 注册bean到容器中
   * 4、使用spring的 FactoryBean (工厂)
   *    1）默认获取到是FactoryBean的getObject()方法返回的对象。
   *    2）如果我们要获取工厂Bean的本身，则在Bean的ID之前加上&  
   */

  @Bean
  public ColorFactory colorFactoryBean() {
    return new ColorFactory();
  }
}
