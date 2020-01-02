package com.zhangwenlong.librarycms.service.impl;

import com.zhangwenlong.librarycms.entity.Book;
import com.zhangwenlong.librarycms.mapper.BookMapper;
import com.zhangwenlong.librarycms.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: librarycms
 * @description: 图书业务逻辑类
 * @author: wanglei
 * @create: 2019-12-30 14:54
 **/
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;
    @Override
    public List<Book> selectBookAll() {
        return bookMapper.selectBookAll();
    }

    @Override
    public Book selectBookById(Integer id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public Integer insertBook(Book book) {
        return bookMapper.insertBook(book);
    }

    @Override
    public Integer updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Integer deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }
}
