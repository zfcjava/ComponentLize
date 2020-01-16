package com.canjun.myapplication;

import com.canjun.arouter_annotation.ARouter;
import com.canjun.common.user.BaseUser;
import com.canjun.common.user.IUser;

@ARouter(path = "/app/getUserInfo")
public class IUserImpl implements IUser {

    @Override
    public BaseUser getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("zfc");
        userInfo.setAccount("abc");
        userInfo.setPassword("123456");
        userInfo.setVipLevel(9);
        return userInfo;
    }
}