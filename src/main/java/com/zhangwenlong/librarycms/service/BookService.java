package com.zhangwenlong.librarycms.service;

import com.zhangwenlong.librarycms.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> selectBookAll();
    Book selectBookById(Integer id);
    Integer insertBook(Book book);
    Integer updateBook(Book book);
    Integer deleteBookById(Integer id);

}
