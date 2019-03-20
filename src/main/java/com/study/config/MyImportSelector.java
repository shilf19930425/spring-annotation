package com.study.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    // TODO 自动生成的方法存根
    //importingClassMetadata
    String className = importingClassMetadata.getClassName();
    /*    Set<String> metaAnnotationTypes = importingClassMetadata.getMetaAnnotationTypes("bill");
    for (String string : metaAnnotationTypes) {
      System.out.println("注解类型------>" + string);
    }*/
    System.out.println("-------->" + className);
    return new String[] {};
  }

}
