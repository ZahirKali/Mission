package com.zki.mission.service;

import com.zki.mission.data.model.Mission;
import com.zki.mission.data.model.ServiceRessource;

/**
 * Interface pour la manipulation de la correspendance Service/Ressource.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
public interface IMissionService {
	
	Mission create(Mission sr);
	
	void delete(Mission sr);

}
