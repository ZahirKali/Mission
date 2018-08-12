package com.zki.mission.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.GenericTest;
import com.zki.mission.data.model.Mission;
import com.zki.mission.data.model.ServiceRessource;

/**
 * Tester les fonctionnalitées importantes de l'application.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
public class MissionServiceTest extends GenericTest{
	
	@Autowired
	private IRessourceService rs; 
	
	@Autowired
	private IServiceService ss;

	@Autowired
	private IMissionService ms;
	
	@Test
	public void testCreate() {	
		Mission sr = new Mission();
		sr.setRessource(rs.create(ressource4Test));
		sr.setService(ss.create(service4Test));
		Mission saved = ms.create(sr);
		Assert.assertNotNull(saved);
	}
	
	@Test
	public void testGetRessourcesByService(){
	}
}
