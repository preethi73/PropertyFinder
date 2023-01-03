package com.property_finder.property__finder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property_finder.property__finder.entity.Property;
import com.property_finder.property__finder.repo.PropertyRepo;



@RestController
@RequestMapping("/property")
public class PropertyController {
@Autowired
private PropertyRepo service;

@GetMapping("/get")
public List<Property> viewPropertyDetails() {
    List<Property> p=this.viewPropertyDetails();
    return p;
}
@GetMapping("/get{id}")
public Property viewPropertyById(long id) {
    Property p=this.service.findById(id).get();
    return p;
}

 
}