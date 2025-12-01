package com.example.lotteryApp.repository;

import com.example.lotteryApp.entity.LotteryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotteryDataRepository extends JpaRepository<LotteryData,Integer> {
}
