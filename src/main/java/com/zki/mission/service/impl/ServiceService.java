package com.zki.mission.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.data.dao.repository.IServiceRepository;
import com.zki.mission.data.model.Service;
import com.zki.mission.service.IServiceService;

@org.springframework.stereotype.Service
public class ServiceService implements IServiceService{

	@Autowired
	private IServiceRepository repo;
	
	@Override
	public Service create(Service service) {
		return repo.save(service);
	}

	@Override
	public void delete(Service service) {
		repo.delete(service);
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
	public Service update(Service user) {
		return repo.save(user);
	}

}
