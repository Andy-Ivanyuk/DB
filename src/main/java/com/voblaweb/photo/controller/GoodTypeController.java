package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.GoodType;
import com.voblaweb.photo.service.goodtype.impls.GoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GoodTypeController {
    @Autowired
    GoodTypeService goodTypeService;
    @RequestMapping("/good_type")
    public List<GoodType> show() throws SQLException {
        return goodTypeService.getAll();
    }
}
