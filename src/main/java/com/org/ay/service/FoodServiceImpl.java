package com.org.ay.service;

import com.org.ay.model.FoodModel;
import com.org.ay.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{

    @Autowired
    FoodRepo foodRepo;

    @Override
    public void createFoodItems(FoodModel foodModel) {
        foodRepo.save(foodModel);
    }

    @Override
    public void updateFoodItems(FoodModel foodModel) {
        foodRepo.save(foodModel);
    }

    @Override
    public void deleteFoodItemsHyId(Integer id) {
        foodRepo.deleteById(id);
    }

    @Override
    public List<FoodModel> getAllFoodItems() {
        return foodRepo.findAll();
    }
}
