package com.org.ay.service;

import com.org.ay.model.FoodModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface FoodService {


    public void createFoodItems(FoodModel foodModel);


    public void updateFoodItems(FoodModel foodModel);


    public void deleteFoodItemsHyId(Integer id);


    public List<FoodModel> getAllFoodItems();
}
