package com.experiment.fuber_test.bootcamp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.experiment.fuber_test.bootcamp.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Serializable> {
    

}
