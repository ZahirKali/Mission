package com.zki.mission.service;

import com.zki.mission.data.model.ServiceRessource;

/**
 * Correspendance Service/Ressource.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
public interface IServiceRessourceService {
	
	ServiceRessource create(ServiceRessource sr);
	
	void delete(ServiceRessource sr);
}
