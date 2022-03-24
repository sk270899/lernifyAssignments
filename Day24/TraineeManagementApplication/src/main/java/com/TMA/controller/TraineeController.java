package com.TMA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TMA.entity.Trainee;
import com.TMA.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	@Autowired
	TraineeService service;
	
	//post-->insert, get-->get, put-->update, delete-->remove
	
	@PostMapping("/addTrainee")
	public Trainee addTrainee(@RequestBody Trainee trn) {
		return service.addTrainee(trn);
	}
	
	@PutMapping("/updateTrainee")
	public Trainee updateTrainee(@RequestBody Trainee trn) {
		return service.updateTrainee(trn);
	}
	
	@GetMapping("/getTrainee/{tid}")
	public Trainee getTrainee(@PathVariable("tid") int trnId) {
		return service.getTrainee(trnId);
	}
	
	@GetMapping("/getAllTrainee")
	public List<Trainee> getAllTrainees() {
		return service.getAllTrainees();
	}
	
	@DeleteMapping("/deleteTrainee/{tid}")
	public String deleteTrainee(@PathVariable("tid") int trnId) {
		return service.deleteTrainee(trnId);
	}
}
