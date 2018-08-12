package com.zki.mission.data.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.zki.mission.data.model.Service;

public interface IServiceRepository extends PagingAndSortingRepository<Service, Integer>{
}
