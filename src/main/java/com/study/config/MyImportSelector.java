package com.study.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    // TODO 自动生成的方法存根
    //importingClassMetadata
    return new String[] {};
  }

}
