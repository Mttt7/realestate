package com.mt.jwtstarter.dto.Property;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class PropertyRequestDto {


    @NotBlank(message = "Name cannot be empty")
    @Length(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotNull(message = "Price cannot be empty")
    @Pattern(regexp = "^(1000|[1-9][0-9]{3,8})$", message = "Price must be between 1000 and 1000000000")
    private Long price;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotBlank(message = "Country cannot be empty")
    private String country;

    @NotBlank(message = "City cannot be empty")
    private String city;

    @NotBlank(message = "Street cannot be empty")
    private String street;

    private String address; // eg 3/2
    @NotBlank(message = "Estate cannot be empty")
    private String estate; //osiedle

    @NotBlank(message = "Floor cannot be empty")
    private int floor;
    @NotBlank(message = "Floors cannot be empty")
    private int floors;
    @NotBlank(message = "Rooms cannot be empty")
    private int rooms;
    @NotBlank(message = "Bathrooms cannot be empty")
    private int bathrooms;
    @NotBlank(message = "Size cannot be empty")
    private int sizeMeters;
    @NotBlank(message = "Parking Spaces cannot be empty")
    private int parkingSpaces;
}
