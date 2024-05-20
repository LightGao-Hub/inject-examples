package org.example.sdk.starter.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.sdk.starter.service.ObjectStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对象存储控制器
 */
@Slf4j
@RestController
@RequestMapping(value = "/storage")
public class StorageController {
    @Autowired
    private ObjectStorageService objectStorageService;
    @GetMapping("/download")
    public void downloadObject(String bucketName, String objectKey) {
        log.info("objectStorageService: {}", objectStorageService);
        objectStorageService.downloadObject(bucketName, objectKey);
    }
}
