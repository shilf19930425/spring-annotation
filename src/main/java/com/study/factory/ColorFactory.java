package com.study.factory;

import org.springframework.beans.factory.FactoryBean;

import com.study.bean.Color;

public class ColorFactory implements FactoryBean<Color> {
  //返回一个Color对象，注册到容器中
  @Override
  public Color getObject() throws Exception {
    // TODO Auto-generated method stub
    return new Color();
  }

  @Override
  public Class<Color> getObjectType() {
    // TODO Auto-generated method stub
    return Color.class;
  }

  //返回的是单实例还是多实例
  //true是单实例，false是多实例
  @Override
  public boolean isSingleton() {
    // TODO Auto-generated method stub
    return true;
  }

}
