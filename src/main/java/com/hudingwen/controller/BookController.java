package com.hudingwen.controller;

import com.hudingwen.controller.entity.Result;
import com.hudingwen.entity.Book;
import com.hudingwen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:BookController
 * Package:com.hudingwen.controller
 * Description:描述
 * Date:2022-10-05 16:49:19
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@RestController
@RequestMapping(value = "/book",produces = "application/json; charset=utf-8")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book){
        boolean save = bookService.save(book);
        if(save)
            return Result.Success("成功");
        else
            return Result.Fail("失败");
    }
    @PutMapping
    public boolean update(@RequestBody Book book){
        return bookService.update(book);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        boolean delete = bookService.delete(id);
        if(delete)
            return Result.Success("成功");
        else
            return Result.Fail("失败");
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Book book = bookService.getById(id);
        if(book != null)
            return Result.Success("成功",book);
        else
            return Result.Fail("失败");
    }
    @GetMapping
    public Result getAll(){
        List<Book> all = bookService.getAll();
        return Result.Success("成功",all);
    }




}
