package com.zhangwenlong.librarycms.service.impl;

import com.zhangwenlong.librarycms.entity.BorrowBook;
import com.zhangwenlong.librarycms.mapper.BookMapper;
import com.zhangwenlong.librarycms.mapper.BorrowBookMapper;
import com.zhangwenlong.librarycms.service.BorrowBookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: librarycms
 * @description: 借书业务逻辑层
 * @author: wanglei
 * @create: 2019-12-31 13:58
 **/
@Service
public class BorrowBookServiceImpl implements BorrowBookService {

    @Resource
    private BorrowBookMapper borrowBookMapper;
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<BorrowBook> getBorrowBook(Integer user_id) {
        return borrowBookMapper.getBorrowBook(user_id);
    }

    @Override
    @Transactional
    public Integer add(BorrowBook borrowBook) {
        Integer i = bookMapper.updateScop(-1, borrowBook.getBook_id());
        return borrowBookMapper.add(borrowBook);
    }

    @Override
    @Transactional
    public Integer updateScop(Integer id,Integer book_id) {
        Integer a = bookMapper.updateScop(0, book_id);
        Integer b = borrowBookMapper.updateScop(id);
        return a+b;
    }

    @Override
    public List<BorrowBook> selectBorrowBookAll() {
        return borrowBookMapper.selectBorrowBookAll();
    }
}
