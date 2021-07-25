package com.example.EquipmentManagment;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EquipmentManagment.equipment.exception.EquipmentException;

@RestController
@RequestMapping(path = "/rest/auth/equipment") 
public class EquipmentMoveController {
	static Logger logger = LoggerFactory.getLogger(EquipmentMoveController.class);
	
	@Autowired
	EquipmentMoveService service;	
	@PostMapping("/add")
	public Equipment addEquipment(@RequestBody Equipment equipment) {
		Optional<String> OptinalEqupmentId= Optional.ofNullable(equipment.getEquipment());
		
		if(!OptinalEqupmentId.isPresent())
			throw new EquipmentException("EQUIPMENT NO NOT PRESENT-Please send the equipemnt number with the request...");

		return service.saveEquipment(equipment);
		
	}
	
	@DeleteMapping("/delete")
	public void deleteEquipment(@RequestBody String Equipemnt) {
		
	}
	
	@GetMapping("/process")
	public String process() {
		return "processing..";
	}
	
    @ExceptionHandler({ EquipmentException.class})
	public String equipemntExceptionHandler(Exception ex) {
		logger.info(ex.getMessage());

		return ex.getMessage();
	}
	
}
