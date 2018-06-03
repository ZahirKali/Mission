package com.zki.mission.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.data.dao.IServiceRessourceDao;
import com.zki.mission.data.dao.repository.IServiceRessourceRepository;
import com.zki.mission.data.model.Ressource;
import com.zki.mission.data.model.Service;
import com.zki.mission.data.model.ServiceRessource;

@org.springframework.stereotype.Service
public class ServiceRessourceDao implements IServiceRessourceDao{

	@Autowired
	private IServiceRessourceRepository repo;
	
	@Override
	public ServiceRessource save(ServiceRessource sr) {
		return repo.save(sr);
	}

	@Override
	public void delete(ServiceRessource sr) {
		repo.delete(sr);
	}

	@Override
	public List<ServiceRessource> findAll() {
		return repo.findAll();
	}

	@Override
	public List<ServiceRessource> findByRessource(Ressource res) {
		return repo.findByRessource(res);
	}

	@Override
	public List<ServiceRessource> findByService(Service serv) {
		return repo.findByService(serv);
	}

}
