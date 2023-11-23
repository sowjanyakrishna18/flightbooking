package com.flight.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.booking.model.Flight;
import com.flight.booking.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public List<Flight> searchFlights(String source, String destination) {

		return flightRepository.findFlightsBySourceAndDestination(source, destination);
	}

	@Override
	public Flight getFlightById(Long id) {

		return flightRepository.getById(id);
	}

	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}
}
