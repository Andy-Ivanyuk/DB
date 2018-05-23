package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.TypeOfSupplies;
import com.voblaweb.photo.service.typeofsupplies.TypeOfSuppliesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfSuppliesController {
    @Autowired
    TypeOfSuppliesServices typeOfSuppliesServices;
    @RequestMapping("/type_of_supplies")
    public List<TypeOfSupplies> show() throws SQLException {
        return typeOfSuppliesServices.getAll();
    }
}
