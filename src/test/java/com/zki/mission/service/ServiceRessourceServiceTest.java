package com.zki.mission.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.GenericTest;
import com.zki.mission.data.model.ServiceRessource;

public class ServiceRessourceServiceTest extends GenericTest {

	@Autowired
	private IRessourceService rs; 
	
	@Autowired
	private IServiceService ss;

	@Autowired
	private IServiceRessourceService srs;
	
	@Test
	public void testCreate() {		
		ServiceRessource sr = new ServiceRessource();
		sr.setRessource(rs.create(ressource4Test));
		sr.setService(ss.create(service4Test));
		ServiceRessource saved = srs.create(sr);
		Assert.assertNotNull(saved);
	}
}
