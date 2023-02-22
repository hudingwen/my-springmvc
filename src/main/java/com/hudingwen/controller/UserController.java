package com.hudingwen.controller;

import com.hudingwen.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * ClassName:UserController
 * Package:com.hudingwen.controller
 * Description:描述
 * Date:2022-10-03 15:10:10
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@Controller
@RequestMapping(value = "/user",produces = "application/json; charset=utf-8")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("保存成功");
        return  "{'msg':'保存成功'}";
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam("txt") String name, int age){
        System.out.println("name->"+name);
        System.out.println("age->"+age);
        return  "{'name':'"+name+"','age':'"+age+"'}";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info(User user){
        System.out.println("user->"+user);
        return  user.toString();
    }

    @RequestMapping("/array")
    @ResponseBody
    public String array(String[] books){
        System.out.println("books->"+ Arrays.toString(books));
        return  Arrays.toString(books);
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(@RequestParam List<String> books){
        System.out.println("books->"+ books);
        return  books.toString();
    }

    @RequestMapping("/list2")
    @ResponseBody
    public String list2(@RequestBody List<String> books){
        System.out.println("books->"+ books);
        return  books.toString();
    }
    @RequestMapping("/list3")
    @ResponseBody
    public String list3(@RequestBody User user){
        System.out.println("user->"+user);
        return  user.toString();
    }
    @RequestMapping("/list4")
    @ResponseBody
    public String list4(@RequestBody List<User> list){
        System.out.println("user->"+list);
        return  list.toString();
    }

    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date,@DateTimeFormat(pattern = "yyyy-MM-dd") Date date1){
        System.out.println("date->"+date);
        System.out.println("date1->"+date1);
        return  "OK";
    }
    //返回/user/index.jsp页面
    @RequestMapping("/res")
    public String res(){
        return "index.jsp";
    }
    //返回/index.jsp页面
    @RequestMapping("/ress")
    public String ress(){
        return "/index.jsp";
    }
    //返回index.jsp字符串
    @RequestMapping("/res2")
    @ResponseBody
    public String res2(){
        return "index.jsp";
    }
    //返回json对象
    @RequestMapping("/res3")
    @ResponseBody
    public User res3(){
        User user = new User();
        user.setName("胡丁文");
        user.setAge(123);
        return user;
    }
}
