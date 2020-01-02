package com.zhangwenlong.librarycms.service;

import com.zhangwenlong.librarycms.entity.BorrowBook;

import java.util.List;

public interface BorrowBookService {
    List<BorrowBook> selectAll();
    Integer add(BorrowBook borrowBook);
}
