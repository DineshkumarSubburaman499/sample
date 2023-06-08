package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.electronics.dao.AcDao;
import com.electronics.entity.AC;
import com.electronics.repository.AcRepository;

@Service
public class AcService {
	@Autowired
	AcDao ad;
	@Autowired
	AcRepository ar;

	public String setAc1(AC c) {
		int np = c.getPrice() - c.getPrice() * c.getDiscount() / 100;
		c.setNetprice(np);
		return ad.setAc1(c);
	}

	public String setAllAc1(List<AC> c) {
		for (AC x : c) {
			x.setNetprice(x.getPrice() - x.getPrice() * x.getDiscount() / 100);
		}
		return ad.setAllAc1(c);
	}

	public AC getById(int id) {
		return ad.getById(id);
	}

	public String updateAc(AC a, int id) {
		AC x = getById(id);
		AC y = a;
		x.setBrand(y.getBrand());
		x.setColour(y.getColour());
		x.setDiscount(y.getDiscount());
		x.setPrice(y.getPrice());
		x.setRating(y.getRating());
		setAc1(x);
		return  "saved";
	}

	public String updateAc1(String colour, int id) {
		AC a1 = ar.findById(id).get();
		a1.setColour(colour);
		ar.save(a1);
		return "saved";
	}

//	public String updateAc1(AC a, int id) {
//		
//		return ad.updateAc1(a,id);
//	}
}
