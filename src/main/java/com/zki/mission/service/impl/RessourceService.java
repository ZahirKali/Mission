package com.zki.mission.service.impl;

import static java.lang.String.format;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zki.mission.data.dao.impl.RessourceDao;
import com.zki.mission.data.model.Ressource;
import com.zki.mission.service.IRessourceService;



@Service
public class RessourceService implements IRessourceService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private RessourceDao ressourceDao;
	
	
	@Override
	public Ressource create(Ressource ressource) {
		logger.info(format("Ajout d'une nouvelle ressource. Code (%s)", ressource.getCode()));
		return ressourceDao.create(ressource);
	}

	@Override
	public void delete(Ressource ressource) {
		logger.info(format("Suppression de la ressource %s", ressource));
		ressourceDao.delete(ressource);
	}

	@Override
	public List<Ressource> findAll() {
		logger.info("Recherche de toutes les ressources");
		return ressourceDao.findAll();
	}

	@Override
	public Ressource findById(int id) {
		logger.info(format("Rechercher la ressource ayant l'id %s", id));
		return ressourceDao.findById(id);
	}

	@Override
	public Ressource update(Ressource ressource) {
		logger.info(format("Mise à jour de la ressource %s", ressource));
		return ressourceDao.update(ressource);
	}     
}
