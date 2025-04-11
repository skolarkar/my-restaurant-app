package com.example.my_restaurant_app.dao;

import com.example.my_restaurant_app.model.Meal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@JdbcTest
@SpringJUnitConfig(classes = {MealDaoImpl.class})
class MealDaoImplTest {

    @Autowired
    private MealDao mealDao;

    // Removed unused JdbcTemplate field

    @Test
    void testGetAllMeals() {
        List<Meal> meals = mealDao.getAllMeals();
        assertFalse(meals.isEmpty(), "Meals list should not be empty");
    }
}