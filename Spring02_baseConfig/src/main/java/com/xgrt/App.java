package com.xgrt;

import com.xgrt.service.BookService;
import com.xgrt.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
