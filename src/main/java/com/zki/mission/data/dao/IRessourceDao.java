package com.zki.mission.data.dao;

import java.util.List;

import com.zki.mission.data.model.Ressource;

/**
 * Acces aux données d'une ressource.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
public interface IRessourceDao {

	Ressource create(Ressource ressource);

	void delete(Ressource ressource);

    List<Ressource> findAll();

    Ressource findById(int id);

    Ressource update(Ressource ressource);
}
