package com.qmkj.usercenterApi;

import com.qmkj.PO.UserPO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**用户中心模块开放的统一接口api
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/24 13:48
 */
public interface UserCenterServiceApi {
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    UserPO getUserById(@RequestParam("id") Integer id);
}
