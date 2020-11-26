package com.clothesPlatform.service;

import com.clothesPlatform.entity.Clothing;

import java.util.List;

public interface ClothingService {
    List<Clothing> findAll();

    boolean saveClothing(Clothing clothing);
}
