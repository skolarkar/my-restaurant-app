package com.example.my_restaurant_app.service;

import com.example.my_restaurant_app.dao.MealDao;
import com.example.my_restaurant_app.model.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealDao mealDao;

    public List<Meal> getAllMeals() {
        return mealDao.getAllMeals();
    }

    public void setMealDao(MealDao mealDao) {
        this.mealDao = mealDao;
    }
}