package com.zki.mission.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.data.dao.IServiceDao;
import com.zki.mission.data.dao.repository.IServiceRepository;
import com.zki.mission.data.model.Service;

@org.springframework.stereotype.Service
public class ServiceDao implements IServiceDao{

	@Autowired
	private IServiceRepository repo;
	
	@Override
	public Service create(Service ressource) {
		return repo.save(ressource);
	}

	@Override
	public void delete(Service ressource) {
		repo.delete(ressource);
	}

	@Override
	public List<Service> findAll() {
		return repo.findAll();
	}

	@Override
	public Service findById(int id) {
		return repo.findOne(id);
	}

	@Override
	public Service update(Service ressource) {
		return repo.save(ressource);
	}

}
