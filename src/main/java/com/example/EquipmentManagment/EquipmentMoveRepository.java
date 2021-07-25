package com.example.EquipmentManagment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentMoveRepository  extends JpaRepository<Equipment, Integer> {
 
	 
	
}
