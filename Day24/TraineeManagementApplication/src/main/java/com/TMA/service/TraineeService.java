package com.TMA.service;

import java.util.List;

import com.TMA.entity.Trainee;

public interface TraineeService {

	Trainee addTrainee(Trainee employee);

	Trainee updateTrainee(Trainee employee);

	String deleteTrainee(int empId);

	Trainee getTrainee(int empId);

	List<Trainee> getAllTrainees();

}
