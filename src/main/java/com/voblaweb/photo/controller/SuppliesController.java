package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Supplies;
import com.voblaweb.photo.service.supplies.SuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SuppliesController {
    @Autowired
    SuppliesService suppliesService;
    @RequestMapping("/supplies")
    public List<Supplies> show() throws SQLException {
        return suppliesService.getAll();
    }
}
