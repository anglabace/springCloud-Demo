package com.qmkj.controller;

import com.qmkj.config.RabbitConfig;
import com.qmkj.entity.User;
import com.qmkj.service.IUserCenterService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户中心控制器
 * @Author: wuqs
 * @CreateDate: 2018/4/24 10:52
 */
@Controller
public class UserCenterController {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @RequestMapping(value = "/rabbitmq")
    public @ResponseBody  String rabbitSend(@RequestParam("id") Integer id){
        for (int i = 0; i < 100; i++) {
            String value = "rabbit"+i;
            System.out.println("producer------"+value);
            //RabbitConsumer rabbitConsumer = new RabbitConsumer();
            //rabbitConsumer.consumeMessage(value);
            rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUTING_KEY, value);
        }
        return "ok";
    }
}
