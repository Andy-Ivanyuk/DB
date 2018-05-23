package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.ServiceSupplies;
import com.voblaweb.photo.service.servicesupplies.ServiceSuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ServiceSuppliesController {
    @Autowired
    ServiceSuppliesService serviceSuppliesService;
    @RequestMapping("/service_supplies")
    public List<ServiceSupplies> show() throws SQLException {
        return serviceSuppliesService.getAll();
    }
}
