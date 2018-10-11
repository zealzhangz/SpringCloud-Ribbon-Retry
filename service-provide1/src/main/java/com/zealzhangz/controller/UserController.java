package com.zealzhangz.controller;

import com.alibaba.fastjson.JSONObject;
import com.zealzhangz.component.PortComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Created by zhanga/tenderfacepalm@163.com.<br/>
 * @version Version: 1.0
 * @date DateTime: 2018/10/11 09:29:00<br/>
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private PortComponent portComponent;

    @RequestMapping(value="/get/{name}",method= RequestMethod.GET)
    public Object get(@PathVariable("name") String name) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        jsonObject.put("port",portComponent.getPort());
        jsonObject.put("timestamp",System.currentTimeMillis());

        return jsonObject;
    }
}
