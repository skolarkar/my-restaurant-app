package com.example.my_restaurant_app.dao;

import  com.example.my_restaurant_app.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getAllBooks() {
        String sql = "SELECT title, author, price FROM books.books";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Book(
                rs.getString("title"),
                rs.getString("author"),
                rs.getDouble("price")

        ));
    }
}
