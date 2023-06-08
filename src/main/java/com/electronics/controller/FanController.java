package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.AC;
import com.electronics.entity.Fan;
import com.electronics.exception.LowpriceException;
import com.electronics.service.FanService;

@RestController
@RequestMapping(value = "/fan")
public class FanController {
	@Autowired
	FanService fs;

	@RequestMapping(value = "/setAc") //->we can use this annotation instead of postmapping becoz of same method(setAC and SetAc)calling
	public String setFan(@RequestBody Fan f) throws LowpriceException {
		return fs.setFan(f);
	}
	@PostMapping(value = "/setAllFan")
	public String setAllFan(@RequestBody List<Fan> f) throws LowpriceException {
		return fs.setAllFan(f);
	}
}
