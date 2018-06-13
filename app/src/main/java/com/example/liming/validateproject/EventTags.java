package com.example.liming.validateproject;

/**
 * Created by liming on 2018/6/13.
 * email liming@finupgroup.com
 */
public interface EventTags {
    /**
     * 登录成功
     */
    int ON_USER_LOGIN = 0x0000;
    int FLASH_INIT_UI = 0x0001;
    int JUMP_TO_MAIN = 0x0002;
    int SHOW_TAB_LIST = 0x0003;
    /**
     * 发布公开成功
     */
    int ON_RELEASE_OPEN = 0x0004;
}
