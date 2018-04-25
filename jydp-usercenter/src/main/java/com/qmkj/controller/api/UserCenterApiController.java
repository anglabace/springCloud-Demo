package com.qmkj.controller.api;

import com.qmkj.PO.UserPO;
import com.qmkj.entity.User;
import com.qmkj.service.IUserCenterService;
import com.qmkj.usercenterApi.UserCenterServiceApi;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/24 14:03
 */
@Controller
public class UserCenterApiController  implements UserCenterServiceApi{
    @Autowired
    private IUserCenterService iUserCenterService;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Override
    public @ResponseBody  UserPO getUserById(@RequestParam("id") Integer id) {
        User user = iUserCenterService.getUserById(id);
        redisTemplate.opsForValue().set("user",user);
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(user,userPO);
        return userPO;
    }
}
