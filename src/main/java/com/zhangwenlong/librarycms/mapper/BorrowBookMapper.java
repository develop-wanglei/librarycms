package com.zhangwenlong.librarycms.mapper;

import com.zhangwenlong.librarycms.entity.Book;
import com.zhangwenlong.librarycms.entity.BorrowBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowBookMapper {

    List<BorrowBook> selectAll();
    Integer add(BorrowBook borrowBook);
}
