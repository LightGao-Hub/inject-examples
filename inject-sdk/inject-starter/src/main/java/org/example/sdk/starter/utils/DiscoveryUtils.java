package org.example.sdk.starter.utils;

import java.util.ServiceLoader;

/**
* spi服务发现工具类
*/
public final class DiscoveryUtils {

    private DiscoveryUtils() {
    }

    /** 按类型匹配, 取默认第一个 */
    public static <T> T discoverService(Class<T> serviceClass, T defaultService) {
        ServiceLoader<T> serviceLoader = ServiceLoader.load(serviceClass);
        if (serviceLoader.iterator().hasNext()) {
            return serviceLoader.iterator().next();
        }
        return defaultService;
    }

}
