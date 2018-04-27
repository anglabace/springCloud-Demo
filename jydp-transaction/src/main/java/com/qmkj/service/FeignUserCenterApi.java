package com.qmkj.service;

import com.qmkj.PO.UserPO;
import com.qmkj.hystricInfo.UserCenterHystric;
import com.qmkj.usercenterApi.UserCenterServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/24 14:14
 */
@FeignClient(value = "jydp-usercenter",fallback = UserCenterHystric.class)
public interface FeignUserCenterApi extends UserCenterServiceApi {
}
