package com.zki.mission.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.GenericTest;
import com.zki.mission.data.model.ServiceRessource;

public class ServiceRessourceTest extends GenericTest{

	@Autowired
	private IServiceRessourceService srs;
	
	@Test @Ignore("Remettre quand on dispose d'une BDD de tests")
	public void testSave() {
		ServiceRessource sr = new ServiceRessource();
		sr.setRessource(ressourceDeTest());
		sr.setService(serviceDeTest());
		ServiceRessource saved = srs.create(sr);
		Assert.assertNotNull(saved);
	}
}
