package com.zki.mission.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.zki.mission.GenericTest;
import com.zki.mission.data.model.Ressource;


public class RessourceServiceTest extends GenericTest {
	
	@Autowired
	private IRessourceService rs; 
	
	@Test
	public void testCreate() {
		Ressource ressourcePersistee = rs.create(ressource4Test);
		Assert.assertNotNull(ressourcePersistee);
		Assert.assertEquals(ressourcePersistee.getCheminPhoto(), RESSOURCE_CHEMIN_PHOTO);
		Assert.assertEquals(ressourcePersistee.getCode(), RESSOURCE_CODE);
		Assert.assertEquals(ressourcePersistee.getNom(), RESSOURCE_NOM);
		Assert.assertEquals(ressourcePersistee.getPrenom(), RESSOURCE_PRENOM);
		Assert.assertTrue(CollectionUtils.isEmpty(ressourcePersistee.getMissions()));
	}
	
	@Test
	public void testUpdate() {
		Ressource ressourcePersistee = rs.create(ressource4Test);
		String autreNom = "autreNomDeTest";
		String autrePrenom = "autrePrenomDeTest";
		
		ressourcePersistee.setNom(autreNom);
		ressourcePersistee.setPrenom(autrePrenom);
		ressourcePersistee = rs.update(ressourcePersistee);
		
		Assert.assertNotNull(ressourcePersistee);
		Assert.assertEquals(ressourcePersistee.getNom(), autreNom);
		Assert.assertEquals(ressourcePersistee.getPrenom(), autrePrenom);
	}
	
	@Test
	public void testDelete() {
		Ressource toDelete = rs.create(ressource4Test);
		Assert.assertNotNull(toDelete);
		
		rs.delete(toDelete);
		Assert.assertNull(rs.findById(toDelete.getId()));
	}
}
