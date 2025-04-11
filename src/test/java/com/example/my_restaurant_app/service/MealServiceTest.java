package com.example.my_restaurant_app.service;

import com.example.my_restaurant_app.dao.MealDao;
import com.example.my_restaurant_app.model.Meal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MealServiceTest {

    private MealService mealService;
    private MealDao mealDao;

    @BeforeEach
    void setUp() {
        mealDao = mock(MealDao.class);
        mealService = new MealService();
        mealService.setMealDao(mealDao); // Add a setter in MealService for testing
    }

    @Test
    void testGetAllMeals() {
        // Mock data
        List<Meal> mockMeals = Arrays.asList(
            new Meal("Pizza", "Delicious cheese pizza", 8.99, "/meal.jpg"),
            new Meal("Burger", "Juicy beef burger with fries", 6.99, "/meal.jpg")
        );

        // Mock behavior
        when(mealDao.getAllMeals()).thenReturn(mockMeals);

        // Test
        List<Meal> meals = mealService.getAllMeals();
        assertEquals(2, meals.size());
        assertEquals("Pizza", meals.get(0).getName());
        assertEquals("Burger", meals.get(1).getName());
    }
}