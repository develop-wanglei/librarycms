package com.zhangwenlong.librarycms.service;

import com.zhangwenlong.librarycms.entity.BorrowBook;

import java.util.List;

public interface BorrowBookService {
    List<BorrowBook> getBorrowBook(Integer user_id);
    Integer add(BorrowBook borrowBook);
    Integer updateScop(Integer id,Integer book_id);
    List<BorrowBook> selectBorrowBookAll();
}
