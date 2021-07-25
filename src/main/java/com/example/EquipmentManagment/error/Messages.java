package com.example.EquipmentManagment.error;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Messages {
	DATABASE(0, "A database error has occurred."), DUPLICATE_USER(1, "This user already exists."),
	USER_NOT_EXIST(3, "User details do not exist with name "), USER_ADD_SUCCESSFULLY(4, "User add successfully");

	private final int code;
	private final String description;

	private Messages(int code, String description) {
		this.code = code;
		this.description = description;
	}

}
