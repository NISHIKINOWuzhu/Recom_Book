package com.nchu.rebooks.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {

    @RequestMapping("/books")
    public String books(){
        return "books/bookList";
    }

    @RequestMapping("/books/add")
    public String bookAdd(){
        return "books/bookAdd";
    }
}
