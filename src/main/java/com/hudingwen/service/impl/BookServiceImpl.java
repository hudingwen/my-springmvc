package com.hudingwen.service.impl;

import com.hudingwen.controller.entity.Code;
import com.hudingwen.dao.BookDao;
import com.hudingwen.entity.Book;
import com.hudingwen.exception.BusinessException;
import com.hudingwen.exception.SystemException;
import com.hudingwen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:BookServiceImpl
 * Package:com.hudingwen.service.impl
 * Description:描述
 * Date:2022-10-05 16:48:41
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {
        if(id==1){
            throw new SystemException(Code.ERR,"模拟系统异常");
        }
        if(id==2){
            throw new BusinessException(Code.BUSINESS_ERR,"模拟业务异常");
        }
        if(id==3){
            throw new RuntimeException("模拟未知异常");
        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
    public List<Book> get(Book book) {
        return bookDao.get(book);
    }
}
