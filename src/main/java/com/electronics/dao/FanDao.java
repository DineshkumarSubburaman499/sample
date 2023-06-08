package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Fan;
import com.electronics.repository.FanRepository;

@Repository
public class FanDao {
	@Autowired
	FanRepository fr;

	public String setFan(Fan f) {
		fr.save(f);
		return "saved";
	}

	public String setAllFan(List<Fan> f) {
		fr.saveAll(f);
		return "saved";
	}
}
