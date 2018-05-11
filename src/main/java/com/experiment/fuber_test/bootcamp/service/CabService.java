package com.experiment.fuber_test.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.experiment.fuber_test.bootcamp.BootcampSearchRequest;
import com.experiment.fuber_test.bootcamp.Cab;
import com.experiment.fuber_test.bootcamp.repository.CabRepository;

@Service
@Transactional(readOnly = true)
public class CabService {
    
    @Autowired
    private CabRepository cabRepository;
    
    @Transactional
    public Cab create(final Cab cab) {
        final Cab newCab = cabRepository.save(cab);
        return newCab;
    }

    public List<Cab> getAllCab(){
        return cabRepository.findAll();
    }
    
    /*public Cab searchCabs(final BootcampSearchRequest bootcampSearchRequest){
        final Cab
            Double customerLongitude = bootcampSearchRequest.getLongitude();
            Double customerLatitude = bootcampSearchRequest.getLatitude();
        List<Cab> listOfCabs = cabRepository.findAll();
        
        final List<String> nearestCab = new ArrayList<String>();
        
        for (final Cab details : listOfCabs){
            final Double newLongtitude= customerLongitude - details.getLongitude();
            final Double newLatitude= customerLatitude - details.getLatitude();
            final Double result = Math.sqrt(Math.pow(newLongtitude, 2) + Math.pow(newLatitude, 2));
        }
        
        return */

        
}
