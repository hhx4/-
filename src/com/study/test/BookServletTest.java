package com.study.test;

import com.study.pojo.Book;
import com.study.service.BookService;
import com.study.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class BookServletTest {
    private BookService bookService = new BookServiceImpl();
    @Test
    public void list() {
        List<Book> books = bookService.queryBooks();
        for (Book book :
                books) {
            System.out.println(book);
        }
    }

    @Test
    public void add() {
        bookService.addBook(new Book(null,"耐克","ch",new BigDecimal(99),999,9,"static/img/default.jpg"));
    }

    @Test
    public void delete() {
        bookService.deleteBookById(1);
    }

    @Test
    public void getBook() {
        Book book = bookService.queryBookById(10);
        System.out.println(book);
    }

    @Test
    public void update() {
        bookService.updateBook(bookService.queryBookById(10));
    }
}