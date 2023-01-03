package com.property_finder.property__finder.service;

import java.util.List;

import com.property_finder.property__finder.entity.Property;

public interface PropertyService {
	public List<Property> viewPropertyDetails();
	public Property viewPropertyById(long id);

}
