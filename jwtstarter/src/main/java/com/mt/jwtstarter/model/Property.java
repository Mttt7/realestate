package com.mt.jwtstarter.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserEntity author;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "description")
    private String description;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "address")
    private String address; // eg 3/2

    @Column(name = "estate")
    private String estate; //osiedle

    @Column(name = "floor")
    private int floor;

    @Column(name = "floors")
    private int floors;

    @Column(name = "rooms")
    private int rooms;

    @Column(name = "bathrooms")
    private int bathrooms;

    @Column(name = "size_meters")
    private int sizeMeters;

    @Column(name = "parking_spaces")
    private int parkingSpaces;




}
