package com.made.sc.repository;

import com.made.sc.dto.VeloDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeloRepository extends MongoRepository<VeloDto, String> {

    //TODO find another way to implement this

}
