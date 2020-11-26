package com.clothesPlatform.repository;

import com.clothesPlatform.entity.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingRepository extends JpaRepository<Clothing,Integer> {
}
