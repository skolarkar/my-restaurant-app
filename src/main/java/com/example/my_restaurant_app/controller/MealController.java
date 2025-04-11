package com.example.my_restaurant_app.controller;

import com.example.my_restaurant_app.model.Meal;
import com.example.my_restaurant_app.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @GetMapping
    public List<Meal> getMeals() {
        return mealService.getAllMeals();
    }
}