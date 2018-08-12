package com.zki.mission.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zki.mission.data.model.Mission;
import com.zki.mission.data.repository.IMissionRepository;
import com.zki.mission.service.IMissionService;

@Service
public class MissionService implements IMissionService {
	
	@Autowired
	private IMissionRepository missionRepo;

	@Override
	public Mission create(Mission mission) {
		return missionRepo.save(mission);
	}

	@Override
	public void delete(Mission mission) {
		missionRepo.delete(mission);
	}

}
