package com.flight.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.model.Flight;
import com.flight.booking.service.FlightServiceImpl;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

	@Autowired
	private FlightServiceImpl flightService;

	@GetMapping("/search")
	public List<Flight> searchFlights(@RequestParam String source, @RequestParam String destination) {
		return flightService.searchFlights(source, destination);
	}

	@GetMapping("/{id}")
	public Flight getFlightDetails(@PathVariable Long id) {
		return flightService.getFlightById(id);
	}
}