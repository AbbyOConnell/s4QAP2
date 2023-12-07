package com.keyin.QAP2.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "passenger",collectionResourceRel = "passenger")
public interface PassengerAPI extends JpaRepository<Passenger,Long> {
}

