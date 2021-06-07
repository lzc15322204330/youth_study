package com.youthstudy.repository;


import com.youthstudy.entity.ShoppingCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCarRepository extends JpaRepository<ShoppingCar, Integer> {
}
