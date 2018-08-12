package com.zki.mission.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zki.mission.data.model.Ressource;

public interface IRessourceRepository extends PagingAndSortingRepository<Ressource, Integer> {
}