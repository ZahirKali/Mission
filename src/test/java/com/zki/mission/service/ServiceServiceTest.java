package com.zki.mission.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.zki.mission.GenericTest;
import com.zki.mission.data.model.Service;

public class ServiceServiceTest extends GenericTest{

	@Autowired
	private IServiceService ss; 
	
	@Test
	public void testCreate() {
		Service servicePersiste = ss.create(service4Test);
		Assert.assertNotNull(servicePersiste);
		Assert.assertEquals(servicePersiste.getCode(), SERVICE_CODE);
		Assert.assertEquals(servicePersiste.getLibelle(), SERVICE_LIBELLE);
		Assert.assertTrue(CollectionUtils.isEmpty(servicePersiste.getMissions()));
	}
	
	@Test
	public void testUpdate() {
		Service servicePersiste = ss.create(service4Test);
		String autreCode = "autreCodeDeTest";
		String autreLibelle = "autreLibelleDeTest";
		
		servicePersiste.setCode(autreCode);
		servicePersiste.setLibelle(autreLibelle);
		servicePersiste = ss.update(servicePersiste);
		
		Assert.assertNotNull(servicePersiste);
		Assert.assertEquals(servicePersiste.getCode(), autreCode);
		Assert.assertEquals(servicePersiste.getLibelle(), autreLibelle);
	}
	
	@Test
	public void testDelete() {
		Service toDelete = ss.create(service4Test);
		Assert.assertNotNull(toDelete);
		
		ss.delete(toDelete);
		Assert.assertNull(ss.findById(toDelete.getId()));
	}
}
