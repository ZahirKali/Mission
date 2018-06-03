package com.zki.mission.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zki.mission.GenericTest;
import com.zki.mission.data.model.Ressource;


public class RessourceServiceTest extends GenericTest{
	
	@Autowired
	private IRessourceService rs; 
	
	@Test
	public void testAdd() {
		Ressource toAdd = new Ressource();
		rs.create(toAdd);
	}
}
