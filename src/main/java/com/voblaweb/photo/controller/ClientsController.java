package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.Clients;
import com.voblaweb.photo.service.clients.impls.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientsController {
    @Autowired
    ClientsService clientsService;
    @RequestMapping("/clients")
    public List<Clients> show() throws SQLException {
        return clientsService.getAll();
    }
}
