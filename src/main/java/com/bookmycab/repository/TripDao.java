package com.bookmycab.repository;

import com.bookmycab.exceptions.TripException;
import com.bookmycab.model.Customer;
import com.bookmycab.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;
import java.util.List;

@Repository
public interface TripDao extends JpaRepository<Trip, Integer> {
}
