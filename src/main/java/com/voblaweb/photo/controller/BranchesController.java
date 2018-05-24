package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Branches;
import com.voblaweb.photo.service.branches.IBranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchesController {
    @Autowired
    IBranchesService branchesService;

    @RequestMapping("/get")
    public List<Branches> getBranches(){
        return branchesService.getAll();
    }

    @PostMapping("/insert")
    public Branches insertCall(@RequestBody Branches branches) {
        return branchesService.insert(branches);
    }

    @RequestMapping("/update")
    public Branches updateCall(@RequestBody Branches branches,@RequestParam("id") int id) {
        branches.setBranchId(id);
        return branchesService.update(branches);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        branchesService.deleteById((int)id);
    }
}
