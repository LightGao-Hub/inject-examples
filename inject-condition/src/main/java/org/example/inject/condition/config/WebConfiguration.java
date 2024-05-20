package org.example.inject.condition.config;

import org.example.inject.annotation.ConditionalOnClassName;
import org.example.inject.condition.service.ObjectStorageService;
import org.example.inject.condition.service.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配类
 */
@Configuration
public class WebConfiguration {

//    @Bean
//    @ConditionalOnProperty(prefix = "storage", name = "provider", havingValue = "default", matchIfMissing = true)
//    public ObjectStorageService defaultObjectStorageServiceImpl() {
//        return new DefaultObjectStorageServiceImpl();
//    }
//
//    @Bean
//    @ConditionalOnProperty(prefix = "storage", name = "provider", havingValue = "aliyun")
//    public ObjectStorageService aliyunObjectStorageServiceImpl() {
//        return new AliyunObjectStorageServiceImpl();
//    }
//
//    @Bean
//    @ConditionalOnProperty(prefix = "storage", name = "provider", havingValue = "s3")
//    public ObjectStorageService s3ObjectStorageServiceImpl() {
//        return new S3ObjectStorageServiceImpl();
//    }

    @Bean
    @ConditionalOnClassName(name = ObjectStorageService.class, matchIfMissing = true)
    public ObjectStorageService defaultObjectStorageServiceImpl() {
        return new DefaultObjectStorageServiceImpl();
    }

    @Bean
    @ConditionalOnClassName(name = ObjectStorageService.class, havingValue = "aliyun")
    public ObjectStorageService aliyunObjectStorageServiceImpl() {
        return new AliyunObjectStorageServiceImpl();
    }

    @Bean
    @ConditionalOnClassName(name = ObjectStorageService.class, havingValue = "s3")
    public ObjectStorageService s3ObjectStorageServiceImpl() {
        return new S3ObjectStorageServiceImpl();
    }

}
