package com.mt.jwtstarter.service;

import com.mt.jwtstarter.dto.Property.PropertyResponseDto;
import org.springframework.data.domain.Page;

public interface PropertyService {
    Page<PropertyResponseDto> getAllProperties(int pageSize, int pageNumber);

}
