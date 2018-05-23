package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.OfficeOrders;
import com.voblaweb.photo.service.officeorders.OfficeOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OfficeOrdersController {
    @Autowired
    OfficeOrdersService officeOrdersService;
    @RequestMapping("/office_orders")
    public List<OfficeOrders> show() throws SQLException {
        return officeOrdersService.getAll();
    }
}
