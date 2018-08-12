package com.zki.mission.service.impl;

import static java.lang.String.format;

import java.util.List;

import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zki.mission.data.model.Ressource;
import com.zki.mission.data.repository.IRessourceRepository;
import com.zki.mission.service.IRessourceService;



/**
 * Service manipulant les ressources (collaborateurs, ...).
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
@Service
public class RessourceService implements IRessourceService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private IRessourceRepository ressourceRepo;
	
	
	@Override
	public Ressource create(Ressource ressource) {
		logger.info(format("Ajout d'une nouvelle ressource. Code (%s)", ressource.getCode()));
		return ressourceRepo.save(ressource);
	}

	@Override
	public void delete(Ressource ressource) {
		logger.info(format("Suppression de la ressource %s", ressource));
		ressourceRepo.delete(ressource);
	}

	@Override
	public List<Ressource> findAll() {
		logger.info("Recherche de toutes les ressources");
		return Lists.newArrayList(ressourceRepo.findAll());
	}

	@Override
	public Ressource findById(int id) {
		logger.info(format("Rechercher la ressource ayant l'id %s", id));
		return ressourceRepo.findOne(id);
	}

	@Override
	public Ressource update(Ressource ressource) {
		logger.info(format("Mise à jour de la ressource %s", ressource));
		return ressourceRepo.save(ressource);
	}     
}
