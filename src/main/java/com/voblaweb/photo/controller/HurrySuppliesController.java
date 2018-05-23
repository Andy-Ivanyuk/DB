package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.HurrySupplies;
import com.voblaweb.photo.service.hurrysupplies.HurrySuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HurrySuppliesController {
    @Autowired
    HurrySuppliesService hurrySuppliesService;
    @RequestMapping("/hurry_supplies")
    public List<HurrySupplies> show() throws SQLException {
        return hurrySuppliesService.getAll();
    }
}
