package com.example.my_restaurant_app.dao;

import com.example.my_restaurant_app.model.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MealDaoImpl implements MealDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Meal> getAllMeals() {
        String sql = "SELECT name, description, price, image_url FROM meals";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Meal(
            rs.getString("name"),
            rs.getString("description"),
            rs.getDouble("price"),
            rs.getString("image_url")
        ));
    }
}
