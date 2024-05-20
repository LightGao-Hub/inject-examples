package org.example.sdk.starter.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.sdk.starter.service.ObjectStorageService;
import java.io.File;

/**
* 默认对象存储服务实现类
*/
@Slf4j
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
}
