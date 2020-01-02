package com.zhangwenlong.librarycms.control;

import com.zhangwenlong.librarycms.entity.Book;
import com.zhangwenlong.librarycms.service.BookService;
import com.zhangwenlong.librarycms.util.RestfulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: librarycms
 * @description: 图书控制层
 * @author: wanglei
 * @create: 2019-12-31 10:37
 **/
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/book",method = RequestMethod.POST)
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private RestfulUtil res;

//    添加图书信息
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Book book){
        Integer i = bookService.insertBook(book);
        if (i>0){
            return res.success(i);
        }
        return res.error("添加失败");
    }
//    修改图书信息
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Book book){
        Integer i = bookService.updateBook(book);
        if(i>0){
            return res.success(i);
        }
        return res.error("修改失败");
    }
//    删除图书信息
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(Integer id){
        Integer i = bookService.deleteBookById(id);
        if (i>0){
            return res.success(i);
        }
        return res.error("删除失败");
    }
//    查看所有图书信息
    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public String selectAll(){
        List<Book> books = bookService.selectBookAll();
        if (books!=null){
            return res.success(books);
        }
        return res.error("未查到数据");
    }
//    查看单个图书信息
    @RequestMapping(value = "/selectById",method = RequestMethod.POST)
    public String selectById(Integer id){
        Book book = bookService.selectBookById(id);
        if (book!=null){
            return res.success(book);
        }
        return res.error("未查到数据");
    }
}
