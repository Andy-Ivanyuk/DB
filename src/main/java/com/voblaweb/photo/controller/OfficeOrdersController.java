package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.OfficeOrders;
import com.voblaweb.photo.service.officeorders.IOfficeOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office_orders")
public class OfficeOrdersController {
    @Autowired
    IOfficeOrdersService officeOrdersService;

    @RequestMapping("/get")
    public List<OfficeOrders> getOfficeOrders(){
        return officeOrdersService.getAll();
    }

    @PostMapping("/insert")
    public OfficeOrders insertCall(@RequestBody OfficeOrders officeOrders) {
        return officeOrdersService.insert(officeOrders);
    }

    @RequestMapping("/update")
    public OfficeOrders updateCall(@RequestBody OfficeOrders officeOrders,@RequestParam("id") int id) {
        officeOrders.setOfficeOrdersId(id);
        return officeOrdersService.update(officeOrders);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        officeOrdersService.deleteById((int)id);
    }
}
