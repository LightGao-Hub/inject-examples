package org.example.sdk.njbank.service.impl;

import org.example.sdk.starter.service.UserEncryptionService;

import java.util.Base64;

/**
 * 使用哈希加密的用户加密服务实现类
 */
public class HashUserEncryptionServiceImpl implements UserEncryptionService {

    @Override
    public String encryptPassword(String password) {
        // 这里使用示例中的一种哈希算法，您可以根据需要选择其他哈希算法
        byte[] hashedBytes = Base64.getEncoder().encode(password.getBytes());
        return new String(hashedBytes);
    }
}

