package com.electronics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.entity.Fan;

public interface FanRepository extends JpaRepository<Fan, Integer> {

}
