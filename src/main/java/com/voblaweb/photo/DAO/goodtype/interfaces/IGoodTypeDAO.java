package com.voblaweb.photo.DAO.goodtype.interfaces;

import com.voblaweb.photo.model.GoodType;

import java.util.List;

public interface IGoodTypeDAO {
    public GoodType insertGoodType(GoodType goodType);
    public GoodType getGoodType(int id);
    public GoodType updateGoodType(GoodType goodType);
    public GoodType deleteGoodType(int id);
    public List<GoodType> getAll();
}
