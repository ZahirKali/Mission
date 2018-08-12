package com.zki.mission.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zki.mission.data.model.ServiceRessource;
import com.zki.mission.data.repository.IServiceRessourceRepository;
import com.zki.mission.service.IServiceRessourceService;

/**
 * Association Ressource/Service
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
@Service
public class ServiceRessourceService implements IServiceRessourceService{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IServiceRessourceRepository srRepo;
	
	@Override
	public ServiceRessource create(ServiceRessource sr) {
		logger.info("Creer une correspendance Service/Ressource");
		return srRepo.save(sr);
	}

	@Override
	public void delete(ServiceRessource sr) {
		logger.info("Supprimer une correspendance Service/Ressource");
		srRepo.delete(sr);		
	}

}
