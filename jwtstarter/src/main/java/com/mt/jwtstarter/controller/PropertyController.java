package com.mt.jwtstarter.controller;


import com.mt.jwtstarter.dto.Property.PropertyResponseDto;
import com.mt.jwtstarter.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/property")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PropertyController {

    private final PropertyService propertyService;

    @GetMapping("/")
    public ResponseEntity<Page<PropertyResponseDto>> getAllProperties( @RequestParam int pageSize,
                                                                       @RequestParam int pageNumber){
        Page<PropertyResponseDto> properties = propertyService.getAllProperties(pageSize,pageNumber);
        return ResponseEntity.ok(properties);
    }
}
