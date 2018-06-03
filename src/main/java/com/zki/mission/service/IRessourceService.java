package com.zki.mission.service;

import java.util.List;


import com.zki.mission.data.model.Ressource;

/**
 * Service de manipulation de resources.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
public interface IRessourceService {

	Ressource create(Ressource ressource);
	
	void delete(Ressource ressource);
	
	List<Ressource> findAll();

	Ressource findById(int id);

	Ressource update(Ressource ressource);
}
