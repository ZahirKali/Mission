package com.zki.mission.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zki.mission.data.model.Ressource;
import com.zki.mission.service.IRessourceService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/ressource"})
public class RessourceController {
	
    @Autowired
    private IRessourceService ressourceService;

    @PostMapping
    public Ressource create(@RequestBody Ressource ressource){
        return ressourceService.create(ressource);
    }

    @GetMapping(path = {"/{id}"})
    public Ressource findOne(@PathVariable(value = "id", required = true) int id){
        return ressourceService.findById(id);
    }

    @PutMapping
    public Ressource update(@RequestBody Ressource ressource){
        return ressourceService.update(ressource);
    }

    @DeleteMapping(path ={"/{id}"})
    public Ressource delete(@PathVariable(value = "id", required = true) int id) {
        Ressource toDelete = ressourceService.findById(id);
        if(Objects.isNull(toDelete)) {
        	ressourceService.delete(toDelete);
        }
    	return toDelete;
    }

    @SuppressWarnings("rawtypes")
	@GetMapping
    public List findAll(){
        return ressourceService.findAll();
    }
}