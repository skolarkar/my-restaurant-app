package com.example.my_restaurant_app.dao;

import com.example.my_restaurant_app.model.Meal;
import java.util.List;

public interface MealDao {
    List<Meal> getAllMeals();
}