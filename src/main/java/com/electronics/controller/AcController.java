package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.automobiles.entity.Car;
import com.electronics.entity.AC;
import com.electronics.repository.AcRepository;
import com.electronics.service.AcService;

@RestController
//@RequestMapping(value = "/ac")
public class AcController {
	@Autowired
	AcService as;
@Autowired
AcRepository ar;
	@RequestMapping(value = "/setAc")
	public String setAc1(@RequestBody AC c) {
		return as.setAc1(c);
	}

	@PostMapping(value = "/setAllAc1")
	public String setAllAc1(@RequestBody List<AC> c) {
		return as.setAllAc1(c);
	}

	@GetMapping(value = "/getById/{id}")
	public AC getById(@PathVariable int id) {
		return as.getById(id);
}
	@PutMapping(value = "/updateAc/{id}")
	public String updateAc(@RequestBody AC a,@PathVariable int id) {
		return as.updateAc(a,id);
}
	@PatchMapping("/acdetails/{id}/{colour}")
	//public ResponseEntity<AC> updateac(@PathVariable int id, @PathVariable String brand) {
		public String updateac1(@PathVariable int id, @PathVariable String colour) {
		//try {
//			AC a = ar.findById(id).get();
//			a.setBrand(brand);
//			return new ResponseEntity<AC>(ar.save(a), HttpStatus.OK);
			return as.updateAc1(colour, id);
		//} catch (Exception e) {
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
//}