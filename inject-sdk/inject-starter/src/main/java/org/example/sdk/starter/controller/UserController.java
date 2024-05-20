package org.example.sdk.starter.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.sdk.starter.service.ObjectStorageService;
import org.example.sdk.starter.service.UserEncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoliang1-jk
 * @Description TODO
 * @date 2024/4/30
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserEncryptionService userEncryptionService;

    @GetMapping("/encryption")
    public void encryption(String password) {
        log.info("userEncryptionService: {}", userEncryptionService);
        userEncryptionService.encryptPassword(password);
    }
}
