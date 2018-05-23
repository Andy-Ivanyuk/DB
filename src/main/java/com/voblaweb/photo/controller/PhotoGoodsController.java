package com.voblaweb.photo.controller;

import com.voblaweb.photo.model.PhotoGoods;
import com.voblaweb.photo.service.photogoods.impls.PhotoGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PhotoGoodsController {
    @Autowired
    PhotoGoodsService photoGoodsService;
    @RequestMapping("/photo_goods")
    public List<PhotoGoods> show() throws SQLException {
        return photoGoodsService.getAll();
    }
}
