package com.zhangwenlong.librarycms.mapper;

import com.zhangwenlong.librarycms.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> selectBookAll();
    Book selectBookById(Integer id);
    Integer insertBook(Book book);
    Integer updateBook(Book book);
    Integer deleteBookById(Integer id);
    Integer updateScop(Integer scop,Integer id);
}
