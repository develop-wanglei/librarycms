package com.zhangwenlong.librarycms.control;

import com.alibaba.fastjson.annotation.JSONField;
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

//    借书
    @RequestMapping(value = "/borrow",method = RequestMethod.POST)
    public String add(BorrowBook borrowBook){
        Integer i = borrowBookService.add(borrowBook);
        if (i>0){
            return res.success(i);
        }
        return res.error("添加失败");
    }
//    还书
    @RequestMapping(value = "/return" ,method = RequestMethod.POST)
    public String returnBook(Integer borrowBook_id,Integer book_id){
        Integer i = borrowBookService.updateScop(borrowBook_id, book_id);
        if (i>1){
            return res.success(i);
        }
        return res.error("还书失败，稍后重试");
    }
//    用户查看借书信息
    @RequestMapping(value = "/getBorrowBook",method = RequestMethod.POST)
    public String get(Integer user_id){
        List<BorrowBook> borrowBook = borrowBookService.getBorrowBook(user_id);
        if (borrowBook.size()!=0){
            return res.success(borrowBook);
        }
        return res.error("未借书");
    }
//    书被哪些用户借阅(管理员查看借书记录)
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public String select(){
        List<BorrowBook> list = borrowBookService.selectBorrowBookAll();
        if (list.size()>0){
            return res.success(list);
        }
        return res.error("查询失败，请稍后重试");
    }
}
