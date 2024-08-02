package com.mt.jwtstarter.mapper;


import com.mt.jwtstarter.dto.Auth.UserResponseDto;
import com.mt.jwtstarter.dto.Property.PropertyResponseDto;
import com.mt.jwtstarter.model.Property;
import com.mt.jwtstarter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.mt.jwtstarter.mapper.UserMapper.mapToUserResponseDto;

@Service
@RequiredArgsConstructor
public class PropertiesMapper {




    public static PropertyResponseDto mapToPropertyResponseDto(Property property){
        return PropertyResponseDto.builder()
                .id(property.getId())
                .name(property.getName())
                .author(mapToUserResponseDto(property.getAuthor()))
                .description(property.getDescription())
                .price(property.getPrice())
                .country(property.getCountry())
                .city(property.getCity())
                .street(property.getStreet())
                .address(property.getAddress())
                .estate(property.getEstate())
                .floor(property.getFloor())
                .floors(property.getFloors())
                .rooms(property.getRooms())
                .bathrooms(property.getBathrooms())
                .sizeMeters(property.getSizeMeters())
                .parkingSpaces(property.getParkingSpaces())
                .createdAt(property.getCreatedAt())
                .lastUpdated(property.getLastUpdated())
                .build();
    }
}





