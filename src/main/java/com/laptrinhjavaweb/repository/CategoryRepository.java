package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.CategoryEntity;


public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneByCode(String code); // lấy data findOneByCode lấy the kiểu sing gồ còn findBy  là lấy 1 list 
}
