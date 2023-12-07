package com.keyin.QAP2.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "city",collectionResourceRel = "city")
public interface CityAPI extends JpaRepository<City,Long> {
}
