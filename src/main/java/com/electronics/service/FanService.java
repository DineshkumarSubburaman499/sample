package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.electronics.dao.FanDao;
import com.electronics.entity.Fan;
import com.electronics.exception.LowpriceException;

@Service
public class FanService {
	@Autowired
	FanDao fd;

	public String setFan(Fan f) throws LowpriceException {
	
			if (f.getPrice() < 2000) {
				throw new LowpriceException("Not eligible");
			} else {
				return fd.setFan(f);
			}
		}
	//this exception is handled by global exception handler

	public String setAllFan(List<Fan> f) throws LowpriceException {
		List<Fan> x = f.stream().filter(y -> y.getPrice() < 2000).toList();
		try {
			if (x.isEmpty()) {
				return fd.setAllFan(f);
			} else {
				throw new LowpriceException("Not eligible");
			}
		} catch (LowpriceException e) {
			return "not eligible";
		}
	}
	//this exception is handled by try catch block
}
