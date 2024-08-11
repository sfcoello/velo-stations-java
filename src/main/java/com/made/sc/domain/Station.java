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
    @Field("empty_slots")
    private String emptySlots;
    @Field("free_bikes")
    private String freeBikes;
    private Extra extra;

}
