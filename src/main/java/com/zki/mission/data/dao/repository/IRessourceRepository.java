package com.zki.mission.data.dao.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.zki.mission.data.model.Ressource;

public interface IRessourceRepository extends Repository<Ressource, Integer> {

	void delete(Ressource resource);

    List<Ressource> findAll();

    Ressource findOne(int id);

    Ressource save(Ressource resource);
}