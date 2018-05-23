package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Professionals;
import com.voblaweb.photo.service.professionals.impls.ProfessionalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfessionalsController {
    @Autowired
    ProfessionalsService professionalsService;
    @RequestMapping("/professionals")
    public List<Professionals> show() throws SQLException {
        return professionalsService.getAll();
    }
}
