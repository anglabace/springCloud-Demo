package com.qmkj.hystricInfo;

import com.qmkj.PO.UserPO;
import com.qmkj.service.FeignUserCenterApi;

/**
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/26 10:07
 */
public class UserCenterHystric implements FeignUserCenterApi{
    @Override
    public UserPO getUserById(Integer id) {
        return  null;
        //return "服务器忙---请稍后再试";
    }
}
