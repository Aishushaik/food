package com.org.ay.controller;

import com.org.ay.model.FoodModel;
import com.org.ay.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping("/create")
    public void createFoodItems(@RequestBody FoodModel foodModel) {
        foodService.createFoodItems(foodModel);
    }

    @PutMapping("/update")
    public void updateFoodItems(@RequestBody FoodModel foodModel) {
        foodService.updateFoodItems(foodModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFoodItemsHyId(@PathVariable Integer id) {
        foodService.deleteFoodItemsHyId(id);
    }

    @GetMapping("/getAll")
    public List<FoodModel> getAllFoodItems() {
        return foodService.getAllFoodItems();

    }
}
