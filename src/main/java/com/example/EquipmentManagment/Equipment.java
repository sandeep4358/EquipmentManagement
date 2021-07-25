package com.example.EquipmentManagment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="EquipmentMST")
public class Equipment {
	@Id
	@GeneratedValue
	private Integer equipemntID;
	private String equipment;
	private String companyToDeal;	
	
}
