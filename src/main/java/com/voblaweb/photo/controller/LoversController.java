package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Lovers;
import com.voblaweb.photo.service.lovers.LoversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LoversController {
    @Autowired
    LoversService loversService;
    @RequestMapping("/lovers")
    public List<Lovers> show() throws SQLException {
        return loversService.getAll();
    }
}
