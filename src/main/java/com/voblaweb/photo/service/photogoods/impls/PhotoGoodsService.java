package com.voblaweb.photo.service.photogoods.impls;

import com.voblaweb.photo.DAO.photogoods.impls.PhotoGoodsDAOFakeImpl;
import com.voblaweb.photo.model.PhotoGoods;
import com.voblaweb.photo.service.photogoods.interfaces.IPhotoGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoGoodsService implements IPhotoGoodsService {

    @Autowired
    PhotoGoodsDAOFakeImpl photoGoodsDAOFake;

    @Override
    public PhotoGoods insertPhotoGoods(PhotoGoods photoGood) {
        return null;
    }

    @Override
    public PhotoGoods getPhotoGoods(int id) {
        return null;
    }

    @Override
    public PhotoGoods updatePhotoGoods(PhotoGoods photoGood) {
        return null;
    }

    @Override
    public PhotoGoods deletePhotoGoods(int id) {
        return null;
    }

    @Override
    public List<PhotoGoods> getAll() {
        return null;
    }
}
