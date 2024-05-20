package org.example.sdk.starter.service.impl;

import org.example.sdk.starter.service.UserEncryptionService;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 默认的用户加密服务实现类，使用 MD5 加密
 */
public class DefaultUserEncryptionServiceImpl implements UserEncryptionService {

    @Override
    public String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}

