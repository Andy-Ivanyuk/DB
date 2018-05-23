package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Suppliers;
import com.voblaweb.photo.service.suppliers.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SuppliersController {
    @Autowired
    SuppliersService suppliersService;
    @RequestMapping("/suppliers")
    public List<Suppliers> show() throws SQLException {
        return suppliersService.getAll();
    }
}
