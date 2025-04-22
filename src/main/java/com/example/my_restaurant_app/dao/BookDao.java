package com.example.my_restaurant_app.dao;

import com.example.my_restaurant_app.model.Book;
import java.util.List;

public interface BookDao {
    List<Book> getAllBooks();
}