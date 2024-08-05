package com.made.sc.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Velo")
@Getter
@AllArgsConstructor
public class VeloDto {

    @Id
    private String id;
    private NetworkDto network;

}
