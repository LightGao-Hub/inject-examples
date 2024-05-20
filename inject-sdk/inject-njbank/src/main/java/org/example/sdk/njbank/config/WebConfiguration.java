package org.example.sdk.njbank.config;

import lombok.extern.slf4j.Slf4j;
import org.example.inject.annotation.ConditionalOnClassName;
import org.example.sdk.njbank.service.impl.HashUserEncryptionServiceImpl;
import org.example.sdk.starter.service.UserEncryptionService;
import org.example.sdk.starter.service.impl.DefaultUserEncryptionServiceImpl;
import org.example.sdk.starter.utils.DiscoveryUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 装配类
 */
@Slf4j
@Configuration
public class WebConfiguration {
    @Bean
    @ConditionalOnClassName(name = UserEncryptionService.class, havingValue = "aliyun")
    public UserEncryptionService userEncryptionService() {
        return new HashUserEncryptionServiceImpl();
    }
}
