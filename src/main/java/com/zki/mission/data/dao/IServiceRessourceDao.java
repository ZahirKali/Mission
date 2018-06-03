package com.zki.mission.data.dao;

import java.util.List;

import com.zki.mission.data.model.Ressource;
import com.zki.mission.data.model.Service;
import com.zki.mission.data.model.ServiceRessource;

public interface IServiceRessourceDao {
	ServiceRessource save(ServiceRessource sr);

	void delete(ServiceRessource sr);

    List<ServiceRessource> findAll();

    List<ServiceRessource> findByRessource(Ressource res);
    
    List<ServiceRessource> findByService(Service serv);
}
