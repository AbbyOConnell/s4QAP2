package com.keyin.QAP2.airport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "airport",collectionResourceRel = "airport")
public interface AirportAPI extends JpaRepository<Airport,Long> {
}
