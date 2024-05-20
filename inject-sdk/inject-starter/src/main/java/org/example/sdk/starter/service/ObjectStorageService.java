package org.example.sdk.starter.service;

import java.io.File;

/**
* 对象存储服务接口
*/
public interface ObjectStorageService {
    /**
     * 上传文件到对象存储
     * @param file 文件
     * @param bucketName 存储桶名称
     * @param objectKey 对象键（文件名）
     * @return 文件在对象存储中的URL
     */
    String uploadObject(File file, String bucketName, String objectKey);

    /**
     * 从对象存储下载文件
     * @param bucketName 存储桶名称
     * @param objectKey 对象键（文件名）
     * @return 文件
     */
    File downloadObject(String bucketName, String objectKey);

}

