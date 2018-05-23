package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Services;
import com.voblaweb.photo.service.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicesController {
    @Autowired
    ServicesService servicesService;
    @RequestMapping("/services")
    public List<Services> show() throws SQLException {
        return servicesService.getAll();
    }
}
