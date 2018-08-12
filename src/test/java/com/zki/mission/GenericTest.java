package com.zki.mission;

import static java.util.Objects.isNull;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zki.mission.data.model.Ressource;
import com.zki.mission.data.model.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenericTest {
	
	protected static final String SERVICE_LIBELLE = "libelleDeTest";
	protected static final String SERVICE_CODE = "codeDeTest";
	
	protected final static String RESSOURCE_NOM = "nomDeTest";
	protected static final String RESSOURCE_PRENOM = "prenomDeTest";
	protected static final String RESSOURCE_CODE = "codeDeTest";
	protected static final String RESSOURCE_CHEMIN_PHOTO = "url/de/test";
	
	protected Ressource ressource4Test;
	protected Service service4Test;
	
	public GenericTest () {
		buildRessource4Test();
		buildService4Test();
	}
	
	private void buildService4Test() {
		if(isNull(service4Test)) {
			service4Test = new Service();
			service4Test.setCode(SERVICE_CODE);
			service4Test.setLibelle(SERVICE_LIBELLE);			
		}
	}
	
	private void buildRessource4Test() {
		if(isNull(ressource4Test)) {
			ressource4Test = new Ressource();
			ressource4Test.setNom(RESSOURCE_NOM);
			ressource4Test.setPrenom(RESSOURCE_PRENOM);
			ressource4Test.setCode(RESSOURCE_CODE);
			ressource4Test.setCheminPhoto(RESSOURCE_CHEMIN_PHOTO);			
		}
	}
}
