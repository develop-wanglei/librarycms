package com.zhangwenlong.librarycms.service.impl;

import com.zhangwenlong.librarycms.entity.BorrowBook;
import com.zhangwenlong.librarycms.mapper.BorrowBookMapper;
import com.zhangwenlong.librarycms.service.BorrowBookService;
import org.springframework.stereotype.Service;

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

    @Override
    public List<BorrowBook> selectAll() {
        return borrowBookMapper.selectAll();
    }

    @Override
    public Integer add(BorrowBook borrowBook) {
        return borrowBookMapper.add(borrowBook);
    }
}
