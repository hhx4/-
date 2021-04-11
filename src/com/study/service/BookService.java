package com.study.service;

import com.study.pojo.Book;
import com.study.pojo.Page;

import java.util.List;

public interface BookService {
    /**
    * use to add book
    * @param book  书对象
    * @return null
    * @dateTime ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
    */
    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();
    public Page<Book> page(int pageNo,int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}
