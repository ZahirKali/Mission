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

import com.zki.mission.data.model.Service;
import com.zki.mission.service.IServiceService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/service"})
public class ServiceController {
	
    @Autowired
    private IServiceService serviceService;

    @PostMapping
    public Service create(@RequestBody Service service){
        return serviceService.create(service);
    }

    @GetMapping(path = {"/{id}"})
    public Service findOne(@PathVariable("id") int id){
        return serviceService.findById(id);
    }

    @PutMapping
    public Service update(@RequestBody Service service){
        return serviceService.update(service);
    }

    @DeleteMapping(path ={"/{id}"})
    public Service delete(@PathVariable("id") int id) {
    	Service toDelete = serviceService.findById(id);
        if(!Objects.isNull(toDelete)) {
        	serviceService.delete(toDelete);
        }
    	return toDelete; 
    }

    @SuppressWarnings("rawtypes")
	@GetMapping
    public List findAll(){
        return serviceService.findAll();
    }
}
