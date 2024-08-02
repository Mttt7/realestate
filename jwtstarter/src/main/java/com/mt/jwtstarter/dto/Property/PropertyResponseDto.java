package com.mt.jwtstarter.dto.Property;


import com.mt.jwtstarter.dto.Auth.UserResponseDto;
import com.mt.jwtstarter.model.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class PropertyResponseDto {

    private Long id;

    private UserResponseDto author;

    private String name;
    private Long price;
    private String description;
    private String country;
    private String city;
    private String street;
    private String address; // eg 3/2
    private String estate; //osiedle
    private int floor;
    private int floors;
    private int rooms;
    private int bathrooms;
    private int sizeMeters;
    private int parkingSpaces;

    private boolean favorite;

    private Timestamp createdAt;
    private Timestamp lastUpdated;
}
