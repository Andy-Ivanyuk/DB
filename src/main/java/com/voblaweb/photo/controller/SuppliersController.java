package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Suppliers;
import com.voblaweb.photo.service.suppliers.ISuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SuppliersController {
    @Autowired
    ISuppliersService suppliersService;

    @RequestMapping("/get")
    public List<Suppliers> getSuppliers(){
        return suppliersService.getAll();
    }

    @PostMapping("/insert")
    public Suppliers insertCall(@RequestBody Suppliers suppliers) {
        return suppliersService.insert(suppliers);
    }

    @RequestMapping("/update")
    public Suppliers updateCall(@RequestBody Suppliers suppliers,@RequestParam("id") int id) {
        suppliers.setSupplierId(id);
        return suppliersService.update(suppliers);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        suppliersService.deleteById((int)id);
    }
}
