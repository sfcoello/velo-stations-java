package com.made.sc.dto;

import com.made.sc.domain.Station;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class NetworkDto {
     private List<Station> stations;
}
