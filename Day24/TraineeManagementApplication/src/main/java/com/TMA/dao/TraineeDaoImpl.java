package com.TMA.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.TMA.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entity;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.getTrnId());
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {

		return entity.merge(trainee);
	}

	@Override
	public String deleteTrainee(int trnId) {
		Trainee trn = entity.find(Trainee.class, trnId);

		if (trn != null) {
			entity.remove(trn);
			return "trainee deleted";
		} else {
			return "no trainee found";
		}
	}

	@Override
	public Trainee getTrainee(int trnId) {

		return entity.find(Trainee.class, trnId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		TypedQuery<Trainee> result = entity.createQuery("select e from trainee t", Trainee.class);
		return result.getResultList();
	}

}
