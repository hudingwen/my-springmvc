package com.hudingwen.service;

import com.hudingwen.config.SpringConfig;
import com.hudingwen.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName:BookServiceTest
 * Package:com.hudingwen.service
 * Description:描述
 * Date:2022-10-05 17:16:12
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println("book:"+book);
    }
    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println("all:"+all);

    }
    @Test
    public void testSave(){
        Book book = new Book();
        boolean save = bookService.save(book);
        System.out.println("save:"+save);
    }
    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(2);
        book.setName("胡丁文");
        boolean update = bookService.update(book);
        System.out.println("update:"+update);
    }
    @Test
    public void testDelete(){
        boolean delete = bookService.delete(3);
        System.out.println("delete:"+delete);
    }
}
