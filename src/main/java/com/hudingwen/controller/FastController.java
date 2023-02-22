package com.hudingwen.controller;

import com.hudingwen.controller.entity.Result;
import com.hudingwen.entity.Book;
import com.hudingwen.entity.User;
import com.hudingwen.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:FastController
 * Package:com.hudingwen.controller
 * Description:描述
 * Date:2022-10-04 16:08:41
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@RestController
@RequestMapping(value = "/fast",produces = "application/json; charset=utf-8")
public class FastController {

    @Autowired
    private BookService bookService;
    private Logger logger=Logger.getLogger("I");

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name){
        logger.fatal("致命错误");
        logger.error("严重警告");
        logger.warn("警告");
        logger.info("普通信息");
        logger.debug("调试信息");
        return "{'test':'"+name+"'}";
    }
    @GetMapping("/test2")
    public String test2(@RequestParam String name){
        return "{'test2':'"+name+"'}";
    }
    @PostMapping("/test3")
    public String test3(@RequestBody User user){
        return "{'test3':'"+user+"'}";
    }
    @GetMapping("/test4")
    public Result get(Book book){
        List<Book> all = bookService.get(book);
        return Result.Success("成功",all);
    }
}
