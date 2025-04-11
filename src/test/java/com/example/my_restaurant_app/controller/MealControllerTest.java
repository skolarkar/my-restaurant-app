package com.example.my_restaurant_app.controller;

import com.example.my_restaurant_app.model.Meal;
import com.example.my_restaurant_app.service.MealService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MealController.class)
class MealControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MealService mealService;

    @Test
    void testGetMeals() throws Exception {
        // Mock data
        Mockito.when(mealService.getAllMeals()).thenReturn(Arrays.asList(
            new Meal("Pizza", "Delicious cheese pizza", 8.99, "/meal.jpg"),
            new Meal("Burger", "Juicy beef burger with fries", 6.99, "/meal.jpg")
        ));

        // Perform GET request and verify response
        mockMvc.perform(get("/api/meals"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$", hasSize(2)))
            .andExpect(jsonPath("$[0].name", is("Pizza")))
            .andExpect(jsonPath("$[1].name", is("Burger")));
    }
}