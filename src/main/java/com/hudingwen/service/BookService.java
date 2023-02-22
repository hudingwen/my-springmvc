package com.hudingwen.service;

import com.hudingwen.entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName:BookService
 * Package:com.hudingwen
 * Description:描述
 * Date:2022-10-05 16:47:19
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查找
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();

    /**
     * 根据条件查询
     * @param book
     * @return
     */
    public List<Book> get(Book book);
}
