package com.clothesPlatform.service.impl;

import com.clothesPlatform.entity.Clothing;
import com.clothesPlatform.repository.ClothingRepository;
import com.clothesPlatform.service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClothingServiceImpl implements ClothingService {
    @Autowired
    ClothingRepository clothingRepository;

    @Override
    public List<Clothing> findAll() {
        return clothingRepository.findAll();
    }

    @Override
    public boolean saveClothing(Clothing clothing) {
        clothingRepository.save(clothing);
        return true;
    }
}
