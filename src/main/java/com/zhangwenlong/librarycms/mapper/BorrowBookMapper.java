package com.zhangwenlong.librarycms.mapper;

import com.zhangwenlong.librarycms.entity.Book;
import com.zhangwenlong.librarycms.entity.BorrowBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowBookMapper {

    List<BorrowBook> getBorrowBook(Integer user_id);
    Integer add(BorrowBook borrowBook);
    Integer updateScop(Integer id);
    List<BorrowBook> selectBorrowBookAll();
}
