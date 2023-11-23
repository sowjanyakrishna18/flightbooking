package com.flight.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.booking.model.AdminLogin;
import com.flight.booking.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	public AdminRepository adminRepository;

	public void changePAssword(AdminLogin adminLogin, String newPassword) {
		Optional<AdminLogin> adminLogintemp = adminRepository.findById(adminLogin.getId());
		if (adminLogintemp.get() != null) {
			if (adminLogintemp.get().getPassoword().equalsIgnoreCase(adminLogin.getPassoword())) {
				adminLogintemp.get().setPassoword(newPassword);
				adminRepository.save(adminLogintemp.get());
			}

		}
	}

}
