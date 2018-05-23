package com.voblaweb.photo.DAO.photogoods.interfaces;

import com.voblaweb.photo.model.PhotoGoods;

import java.util.List;

public interface IPhotoGoodsDAO {
    public PhotoGoods insertPhotoGoods(PhotoGoods photoGood);
    public PhotoGoods getPhotoGoods(int id);
    public PhotoGoods updatePhotoGoods(PhotoGoods photoGood);
    public PhotoGoods deletePhotoGoods(int id);
    public List<PhotoGoods> getAll();
}
