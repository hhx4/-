package com.study.test;

import com.study.pojo.Book;
import com.study.pojo.Page;
import com.study.service.BookService;
import com.study.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    private BookService bookService = new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book(1,"国哥在手，天下我有！", "1125", new BigDecimal(1000000),
                100000000, 0, null));}
    @Test
    public void deleteBookById() {
        bookService.deleteBookById(22);
    }
    @Test
    public void updateBook() {
        bookService.updateBook(new Book(1,"社会我国哥，人狠话不多！", "1125", new BigDecimal(999999),
                10, 111110, null));
    }
    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }
    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void page() {

    }

    @Test
    public void pageByPrice() {
        Page<Book> page = bookService.pageByPrice(2, 4, 0, 200);
        System.out.println(page);
    }
}