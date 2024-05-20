package org.example.sdk.starter;

import lombok.extern.slf4j.Slf4j;
import org.example.inject.annotation.ConditionalOnClassName;
import org.example.sdk.starter.service.ObjectStorageService;
import org.example.sdk.starter.service.UserEncryptionService;
import org.example.sdk.starter.service.impl.DefaultObjectStorageServiceImpl;
import org.example.sdk.starter.service.impl.DefaultUserEncryptionServiceImpl;
import org.example.sdk.starter.utils.DiscoveryUtils;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 自动装配类
 */
@Slf4j
@Configurable
@ComponentScan
public class WebAutoConfiguration {
	@Bean
	public ObjectStorageService objectStorageService() {
		return DiscoveryUtils.discoverService(ObjectStorageService.class, new DefaultObjectStorageServiceImpl());
	}

	@Bean
	@ConditionalOnClassName(name = UserEncryptionService.class, matchIfMissing = true)
	public UserEncryptionService userEncryptionService() {
		return new DefaultUserEncryptionServiceImpl();
	}
}
