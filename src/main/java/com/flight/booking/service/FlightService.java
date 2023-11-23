package com.flight.booking.service;

import java.util.List;

import com.flight.booking.model.Flight;

public interface FlightService {
	List<Flight> searchFlights(String source, String destination);

	Flight getFlightById(Long id);
}