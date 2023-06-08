package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.AC;
import com.electronics.repository.AcRepository;

@Repository
public class AcDao {
	@Autowired
	AcRepository ac;

	public String setAllAc1(List<AC> c) {
		ac.saveAll(c);
		return "saved";
	}

	public String setAc1(AC c) {
		ac.save(c);
		return "saved";
	}

	public AC getById(int id) {
		return ac.findById(id).get();
	}

//	public String updateAc1(AC a, int id) {
//
//		return "saved";
//	}
}
