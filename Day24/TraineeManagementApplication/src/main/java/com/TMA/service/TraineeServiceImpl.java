package com.TMA.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TMA.dao.TraineeDao;
import com.TMA.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl  implements TraineeService{
	
	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return dao.updateTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int trnId) {
		
		return dao.deleteTrainee(trnId);
	}

	@Override
	public Trainee getTrainee(int trnId) {
	
		return dao.getTrainee(trnId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		
		return dao.getAllTrainees();
	}

}
