package com.zki.mission.service.impl;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.data.model.Service;
import com.zki.mission.data.repository.IServiceRepository;
import com.zki.mission.service.IServiceService;

/**
 * Service manipulant les services (Prestation, ...)
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
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
		return Lists.newArrayList(repo.findAll());
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
