package org.example.sdk.starter.service;

/**
 * 用户加密服务接口
 */
public interface UserEncryptionService {

    /**
     * 将用户输入的密码进行加密处理
     * @param password 用户输入的密码
     * @return 加密后的密码
     */
    String encryptPassword(String password);
}

