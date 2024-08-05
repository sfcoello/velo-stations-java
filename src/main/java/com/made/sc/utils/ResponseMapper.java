package com.made.sc.utils;

import com.made.sc.dto.VeloDto;
import com.made.sc.dto.VeloStationsResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResponseMapper {

    public static VeloStationsResponse map(VeloDto veloDto) {
        return VeloStationsResponse.builder()
                .id(veloDto.getId())
                .network(veloDto.getNetwork())
                .build();
    }
}
