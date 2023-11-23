package com.flight.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.model.AdminLogin;
import com.flight.booking.model.Flight;
import com.flight.booking.service.AdminService;
import com.flight.booking.service.FlightServiceImpl;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	public AdminService adminService;
	public FlightServiceImpl flightService;

	@PostMapping("/changepassword")

	public ResponseEntity<String> saveNewPassword(@RequestBody AdminLogin adminLogin,
			@RequestParam String newpassword) {
		// Validate the request and call the service to change the password
		adminService.changePAssword(adminLogin, newpassword);
		return ResponseEntity.ok("password chagned successfully");
	}

	@GetMapping("/getAllFlights")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();

	}

}