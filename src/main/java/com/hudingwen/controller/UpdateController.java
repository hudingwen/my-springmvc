package com.hudingwen.controller;

import com.hudingwen.controller.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UpdateController
 * Package:com.hudingwen.controller
 * Description:描述
 * Date:2022-10-08 11:13:55
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@RestController
@RequestMapping(value = "/update",produces = "application/json; charset=utf-8")
public class UpdateController {
    @GetMapping("/check/{version}")
    public Result check(@PathVariable String version){
        if(version.isEmpty()){
            return Result.Fail("参数错误");
        }
        String[] split = version.split(".");
        if(split.length != 3){
            return Result.Fail("参数错误");
        }
        return null;
    }
}
