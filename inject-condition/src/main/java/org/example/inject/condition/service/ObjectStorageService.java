package org.example.inject.condition.service;

import java.io.File;

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

    /**
     * 删除对象存储中的文件
     * @param bucketName 存储桶名称
     * @param objectKey 对象键（文件名）
     */
    void deleteObject(String bucketName, String objectKey);
}

