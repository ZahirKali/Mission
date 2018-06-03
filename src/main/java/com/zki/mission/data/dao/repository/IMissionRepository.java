package com.zki.mission.data.dao.repository;

import java.util.List;

import com.zki.mission.data.model.Mission;

public interface IMissionRepository {
	Mission create(Mission ressource);

	void delete(Mission ressource);

    List<Mission> findAll();

    Mission findById(int id);

    Mission update(Mission ressource);
}
