package com.example.EquipmentManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentMoveService {
	
	@Autowired
	EquipmentMoveRepository repository;
	
	public Equipment saveEquipment(Equipment equipment) {
		return repository.save(equipment);
	}
	
}
