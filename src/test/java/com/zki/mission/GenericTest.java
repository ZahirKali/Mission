package com.zki.mission;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zki.mission.data.model.Ressource;
import com.zki.mission.data.model.Service;
import com.zki.mission.service.IRessourceService;
import com.zki.mission.service.IServiceService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenericTest {

	@Autowired
	private IServiceService serviceService;
	
	@Autowired 
	private IRessourceService ressourceService;
	
	protected Service serviceDeTest() {
		Service srv = new Service();
		srv.setCode("codeDeTest");
		srv.setLibelle("libelleDeTest");
		return serviceService.create(srv);
	}
	
	protected Ressource ressourceDeTest() {
		Ressource r = new Ressource();
		r.setNom("nomDeTest");
		r.setPrenom("prenomDeTest");
		r.setCheminPhoto("url/de/test");
		return ressourceService.create(r);
	}
}
