package com.study.config;

import java.io.IOException;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

  /**
   * MetadataReader 读取当前类的信息
   * MetadataReaderFactory 可以读取到其他类的信息
   */
  public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
    throws IOException {
    // TODO Auto-generated method stub
    //获取当前类注解信息
    AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
    //可以获取到当前所有扫描到的类信息。
    //可以根据扫描到的类信息做一些过滤条件。
    ClassMetadata classMetadata = metadataReader.getClassMetadata();
    return false;
  }

}
