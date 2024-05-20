package org.example.inject.condition.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.inject.condition.service.ObjectStorageService;

import java.io.File;

@Slf4j
//@Service
//@Primary
//@ConditionalOnProperty(prefix = "storage", name = "provider", havingValue = "default", matchIfMissing = true)
public class DefaultObjectStorageServiceImpl implements ObjectStorageService {

    @Override
    public String uploadObject(File file, String bucketName, String objectKey) {
        // 默认实现上传逻辑
        return "Default implementation: Upload successful";
    }

    @Override
    public File downloadObject(String bucketName, String objectKey) {
        // 默认实现下载逻辑
        return new File("default-file.txt");
    }

    @Override
    public void deleteObject(String bucketName, String objectKey) {
        // 默认实现删除逻辑
        System.out.println("Default implementation: Object deleted");
    }
}
