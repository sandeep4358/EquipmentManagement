package com.example.EquipmentManagment.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EquipmentManagment.security.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
   User findByUsername(String userName); 
}
