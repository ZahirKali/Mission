package com.zki.mission.service;

import java.util.List;

import com.zki.mission.data.model.Service;


public interface IServiceService {
	
    Service create(Service service);

    void delete(Service service);

    List<Service> findAll();

    Service findById(int id);

    Service update(Service user);
}
