package com.example.EquipmentManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EquipmentManagment.error.Messages;
import com.example.EquipmentManagment.security.api.model.User;
import com.example.EquipmentManagment.security.api.repository.UserRepository;

@RestController
@RequestMapping("/secure/auth")
public class AdminController {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		String pwd = user.getPassword();
		String encryptPwd = passwordEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		userRepository.save(user);
		return Messages.USER_ADD_SUCCESSFULLY.toString();
	}
	
	//@PreAuthorize("hasAnyRole('admin')")
	@GetMapping("/admin/all")
	public String securedHello() {
		return "Secured Hello";
	}
}
