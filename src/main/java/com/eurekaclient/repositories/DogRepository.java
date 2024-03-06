package com.eurekaclient.repositories;

import com.eurekaclient.entities.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
