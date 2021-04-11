package com.study.test;

import com.study.dao.BookDao;
import com.study.dao.impl.BookDaoImpl;
import com.study.pojo.Book;
import com.study.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookDaoImplTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null, "python", "100", new BigDecimal(9999), 1111, 0, null));
    }

    @Test
    public void deleteBookById() {

        int i = bookDao.deleteBookById(25);
        System.out.println(i);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(3, "大家都可以这么帅！", "国哥",
                new BigDecimal(9999), 1100000, 0, null
        ));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(3));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook :
                bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {

    }

    @Test
    public void queryForPageItems() {
        for (Book book : bookDao.queryForPageItems(1, Page.PAGE_SIZE)) {
            System.out.println(book);
        }
    }

    @Test
    public void queryForPageTotalCountByPrice() {
    }

    @Test
    public void queryForPageItemsByPrice() {
    }
}