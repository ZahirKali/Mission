package com.zki.mission.data.dao.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.zki.mission.data.model.Ressource;
import com.zki.mission.data.model.Service;
import com.zki.mission.data.model.ServiceRessource;

public interface IServiceRessourceRepository extends Repository<ServiceRessource, Integer>{

	ServiceRessource save(ServiceRessource sr);

	void delete(ServiceRessource sr);

    List<ServiceRessource> findAll();

    List<ServiceRessource> findByRessource(Ressource res);
    
    List<ServiceRessource> findByService(Service serv);
}