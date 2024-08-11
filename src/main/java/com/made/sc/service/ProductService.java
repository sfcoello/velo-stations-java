package com.made.sc.service;

import com.made.sc.controller.ProductController;
import com.made.sc.dto.VeloDto;
import com.made.sc.repository.VeloRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private VeloRepository veloRepository;

    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    public VeloDto getStations()  { //TODO modify db to find only obj network
        return findAllStations().get(0);

    }

    private List<VeloDto> findAllStations() {
        try {
            log.info("Calling mongo to find all stations");
            return veloRepository.findAll();

        } catch (Exception e) {
            throw new RuntimeException("Fail while getting stations" + e.getMessage(), e);
        }

    }
}
