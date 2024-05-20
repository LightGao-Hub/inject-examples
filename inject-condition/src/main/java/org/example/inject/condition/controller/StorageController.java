package org.example.inject.condition.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.inject.condition.service.ObjectStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoliang1-jk
 * @Description TODO
 * @date 2024/4/30
 */
@Slf4j
@RestController
public class StorageController {
    @Autowired
//    @Qualifier("aliyunObjectStorageServiceImpl")
//    @Resource(name = "aliyunObjectStorageServiceImpl")
    private ObjectStorageService objectStorageService;

    @GetMapping("/example")
    public void example() {
        log.info("objectStorageService: {}", objectStorageService);
    }
}
