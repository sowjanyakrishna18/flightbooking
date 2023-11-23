package com.flight.booking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flight.booking.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
	// Custom query methods if needed

	@Query("SELECT f FROM Flight f WHERE f.source = :source AND f.destination = :destination")
	List<Flight> findFlightsBySourceAndDestination(@Param("source") String source,
			@Param("destination") String destination);

}
