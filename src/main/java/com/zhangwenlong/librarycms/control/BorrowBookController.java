package com.zhangwenlong.librarycms.control;

import com.zhangwenlong.librarycms.entity.BorrowBook;
import com.zhangwenlong.librarycms.service.BorrowBookService;
import com.zhangwenlong.librarycms.util.RestfulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: librarycms
 * @description: 借书控制层
 * @author: wanglei
 * @create: 2019-12-31 13:59
 **/
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/borrowBook",method = RequestMethod.POST)
public class BorrowBookController {

    @Autowired
    private BorrowBookService borrowBookService;
    @Autowired
    private RestfulUtil res;

    @RequestMapping(value = "/select",method =RequestMethod.POST)
    public String select(){
        List<BorrowBook> borrowBooks = borrowBookService.selectAll();
        if (borrowBooks!=null){
            return res.success(borrowBooks);
        }
        return res.error("未查询到数据");
    }
//    借书
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(BorrowBook borrowBook){
        Integer i = borrowBookService.add(borrowBook);
        if (i>0){
            return res.success(i);
        }
        return res.error("添加失败");
    }
}
