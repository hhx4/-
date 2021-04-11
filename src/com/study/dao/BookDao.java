package com.study.dao;

import com.study.pojo.Book;

import java.util.List;

/**
 * @author 22607
 */
public interface BookDao {
    /**
     * 用于添加图书
     * @param book 图书
     * @return  返回null代表添加失败，返回常数表示添加成功
     */
     int addBook(Book book);
     /**
     * 用于删除书籍
      * @param id 书籍id
      * @return 返回null表示删除失败
     */
     int deleteBookById(Integer id);
     /**
      *
      * 用于更新书籍
      * @param book 书
      * @return 同上
      */
     int updateBook(Book book);
     /**
     *  use to query book by id
     * @param id ,book id
     * @return  同上
     * @dateTime ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE} 
     */
     public Book queryBookById(Integer id);
     /**
     *  book list
     * @return List<book>
     * @dateTime ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
     */
     public List<Book> queryBooks();
     /**
     * 查询页面总数
     * @param
     * @return 页面数
     * @dateTime ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
     */
     public Integer queryForPageTotalCount();

     public List<Book> queryForPageItems(int begin,int pageSize);

    Integer queryForPageTotalCountByPrice(int min, int max);

 List<Book> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
