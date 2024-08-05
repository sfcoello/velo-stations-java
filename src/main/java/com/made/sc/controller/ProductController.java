package com.made.sc.controller;

import com.made.sc.dto.VeloStationsResponse;
import com.made.sc.service.ProductService;
import com.made.sc.utils.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/velo")
public class ProductController {

    @Autowired private ProductService productService;

    @GetMapping(value = "/stations", consumes = "application/json")
    public ResponseEntity<VeloStationsResponse> getStations() {
        return ResponseEntity.ok(
                ResponseMapper.map(
                        productService.getStations())
        );
    }
}
