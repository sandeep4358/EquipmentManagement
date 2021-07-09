package com.example.EquipmentManagment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/equipment/")
public class EquipmentMoveController {
	Logger logger = LoggerFactory.getLogger(EquipmentMoveController.class);
	@PostMapping("/add")
	public void addEquipment(@RequestBody Equipment Equipemnt) {
		logger.info(null);
	}
	
	@DeleteMapping("/delete")
	public void deleteEquipment(@RequestBody String Equipemnt) {
		
	}
	
	@ExceptionHandler
	public void equipemntExceptionHandler() {
		
	}
	
}
