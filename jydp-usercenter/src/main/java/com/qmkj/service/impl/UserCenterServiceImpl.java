package com.qmkj.service.impl;

import com.qmkj.dao.UserCenterDao;
import com.qmkj.entity.User;
import com.qmkj.service.IUserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/24 10:55
 */
@Service("userCenterService")
public class UserCenterServiceImpl implements IUserCenterService {
    @Autowired
    private UserCenterDao userCenterDao;
    @Override
    public User getUserById(Integer id) {
        return userCenterDao.getUserById(id);
    }
}
