package com.qmkj.controller;

import com.qmkj.PO.UserPO;
import com.qmkj.service.FeignUserCenterApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/24 13:37
 */
@Controller
public class TransactionController {
    @Autowired
    private FeignUserCenterApi feignUserCenterApi;
    @RequestMapping(value = "/getUserById" , method = RequestMethod.GET)
    public @ResponseBody UserPO getUserById(@RequestParam("id") Integer id){
        return feignUserCenterApi.getUserById(id);
    }
}
