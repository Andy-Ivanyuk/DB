package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Branches;
import com.voblaweb.photo.service.branches.impls.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchesController {
    @Autowired
    BranchesService branchesService;
    @RequestMapping("/branches")
    public List<Branches> show() throws SQLException {
        return branchesService.getAll();
    }
}
