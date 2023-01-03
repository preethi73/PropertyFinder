package com.property_finder.property__finder.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.property__finder.entity.Property;
import com.property_finder.property__finder.repo.PropertyRepo;
import com.property_finder.property__finder.service.PropertyService;
@Service
public class PropertyServiceImpl implements PropertyService {
@Autowired
private PropertyRepo propertyRepo;

	@Override
	public List<Property> viewPropertyDetails() {
		// TODO Auto-generated method stub
		List<Property> p=this.propertyRepo.findAll();
		return p;
	}

	@Override
	public Property viewPropertyById(long id) {
		// TODO Auto-generated method stub
		Property property=propertyRepo.findById(id).get();
		return property;
	}
	
}
