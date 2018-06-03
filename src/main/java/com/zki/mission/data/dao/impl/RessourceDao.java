package com.zki.mission.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zki.mission.data.dao.IRessourceDao;
import com.zki.mission.data.dao.repository.IRessourceRepository;
import com.zki.mission.data.model.Ressource;

/**
 * Acces à la Ressource.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
@Service
public class RessourceDao implements IRessourceDao{
	
	@Autowired
	private IRessourceRepository ressourceRepo;
	
	
	@Override
	public Ressource create(Ressource ressource) {
		return ressourceRepo.save(ressource);
	}

	@Override
	public void delete(Ressource ressource) {
		ressourceRepo.delete(ressource);
	}

	@Override
	public List<Ressource> findAll() {
		return ressourceRepo.findAll();
	}

	@Override
	public Ressource findById(int id) {
		return ressourceRepo.findOne(id);
	}

	@Override
	public Ressource update(Ressource ressource) {
		//FIXME .save(ressource) ?
		return ressourceRepo.save(ressource);
	}
}
