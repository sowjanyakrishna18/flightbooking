package com.flight.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.booking.model.AdminLogin;
@Repository
public interface AdminRepository extends JpaRepository<AdminLogin, Integer> {

}
