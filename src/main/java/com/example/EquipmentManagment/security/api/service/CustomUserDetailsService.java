package com.example.EquipmentManagment.security.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.EquipmentManagment.equipment.exception.UserDetailsException;
import com.example.EquipmentManagment.error.Messages;
import com.example.EquipmentManagment.security.api.model.User;
import com.example.EquipmentManagment.security.api.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		CustomUserDetails customeUserDetails = new CustomUserDetails();
		Optional<User> optional = Optional.ofNullable(user);
		user = optional.orElseThrow(() -> {
			throw new UserDetailsException(Messages.USER_NOT_EXIST.toString() + " " + username);
		});
		customeUserDetails.setUser(user);
		return customeUserDetails;
	}
}
