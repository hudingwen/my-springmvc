package com.hudingwen.dao;

import com.hudingwen.entity.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * ClassName:BookDao
 * Package:com.hudingwen.dao
 * Description:描述
 * Date:2022-10-05 16:46:20
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/


public interface BookDao {
    @Insert("insert into book values(null,#{type},#{name},#{description})")
    public int save(Book book);
    @Update("update book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);
    @Delete("delete from book where id=#{id}")
    public int delete(Integer id);
    @Select("select * from book where id=#{id}")
    public Book getById(Integer id);
    @Select("select * from book")
    public List<Book> getAll();

    @Select({
            "<script>",
            "select * from book","where 1=1",
            "<if test='name!=null and name != \"\"'>", "and name = #{name}", "</if>",
            "</script>"
    })
    public List<Book> get(Book book);
}
