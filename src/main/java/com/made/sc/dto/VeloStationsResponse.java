package com.made.sc.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@Builder
public class VeloStationsResponse {

    @Id
    private String id;
    private NetworkDto network;

}
