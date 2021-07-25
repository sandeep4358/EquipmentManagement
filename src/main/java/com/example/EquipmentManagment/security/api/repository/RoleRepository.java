package com.example.EquipmentManagment.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EquipmentManagment.security.api.model.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{

}
