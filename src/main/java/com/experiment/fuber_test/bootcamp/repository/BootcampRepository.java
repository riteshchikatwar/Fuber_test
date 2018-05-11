package com.experiment.fuber_test.bootcamp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.experiment.fuber_test.bootcamp.Customer;

@Repository
public interface BootcampRepository extends JpaRepository<Customer, Serializable> {
    

}
