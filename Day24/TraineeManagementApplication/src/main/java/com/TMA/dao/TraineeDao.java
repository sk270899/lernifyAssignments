package com.TMA.dao;

import java.util.List;

import com.TMA.entity.Trainee;

public interface TraineeDao {

	Trainee addTrainee(Trainee employee);

	Trainee updateTrainee(Trainee employee);

	String deleteTrainee(int empId);

	Trainee getTrainee(int empId);

	List<Trainee> getAllTrainees();
}
