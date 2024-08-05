package com.made.sc.domain;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@AllArgsConstructor
    public class Station {
    
    @Id
    @Field("id")
    private String id;
    private Double latitude;
    private Double longitude;
    private String name;

}
