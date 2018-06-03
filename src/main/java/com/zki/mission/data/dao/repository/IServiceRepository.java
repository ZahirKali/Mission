package com.zki.mission.data.dao.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.zki.mission.data.model.Service;

public interface IServiceRepository extends Repository<Service, Integer>{

	void delete(Service service);

    List<Service> findAll();

    Service findOne(int id);

    Service save(Service user);

}
