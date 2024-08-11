package com.made.sc.controller;

import com.made.sc.dto.VeloStationsResponse;
import com.made.sc.service.ProductService;
import com.made.sc.utils.ResponseMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/velo")
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    @Autowired private ProductService productService;

    @GetMapping(value = "/stations")
    public ResponseEntity<VeloStationsResponse> getStations() {
        log.info("Get all stations call from ");
        return ResponseEntity.ok(
                ResponseMapper.map(
                        productService.getStations())
        );
    }
}
