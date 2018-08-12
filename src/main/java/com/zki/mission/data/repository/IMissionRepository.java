package com.zki.mission.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zki.mission.data.model.Mission;

public interface IMissionRepository extends PagingAndSortingRepository<Mission, Integer>{
}
