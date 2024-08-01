package com.mt.jwtstarter.service.serviceImpl;

import com.mt.jwtstarter.dto.Property.PropertyResponseDto;
import com.mt.jwtstarter.mapper.PropertiesMapper;
import com.mt.jwtstarter.model.Property;
import com.mt.jwtstarter.repository.PropertyRepository;
import com.mt.jwtstarter.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;
    @Override
    public Page<PropertyResponseDto> getAllProperties(int pageSize, int pageNumber) {


     Page<Property>  propertiesPage = this.propertyRepository.findAll(PageRequest.of(pageNumber,pageSize));

        return new PageImpl<>(
                propertiesPage
                        .stream()
                        .map(PropertiesMapper::mapToPropertyResponseDto)
                        .collect(Collectors.toList()),
                PageRequest.of(pageNumber,pageSize),
                propertiesPage.getTotalElements()
        );
    }
}
