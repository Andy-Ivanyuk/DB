package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Kiosks;
import com.voblaweb.photo.service.kiosks.KiosksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class KiosksController {
    @Autowired
    KiosksService kiosksService;
    @RequestMapping("/kiosks")
    public List<Kiosks> show() throws SQLException {
        return kiosksService.getAll();
    }
}
