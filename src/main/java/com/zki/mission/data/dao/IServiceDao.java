package com.zki.mission.data.dao;

import java.util.List;

import com.zki.mission.data.model.Service;

/**
 * Acces aux données d'un service.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
public interface IServiceDao {

	Service create(Service ressource);

	void delete(Service ressource);

    List<Service> findAll();

    Service findById(int id);

    Service update(Service ressource);
}
