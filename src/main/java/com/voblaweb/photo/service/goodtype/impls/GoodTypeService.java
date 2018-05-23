package com.voblaweb.photo.service.goodtype.impls;

import com.voblaweb.photo.DAO.goodtype.impls.GoodTypeDAOFakeImpl;
import com.voblaweb.photo.model.GoodType;
import com.voblaweb.photo.service.goodtype.interfaces.IGoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodTypeService implements IGoodTypeService {

    @Autowired
    GoodTypeDAOFakeImpl goodTypeDAOFake;

    @Override
    public GoodType insertGoodType(GoodType goodType) {
        return null;
    }

    @Override
    public GoodType getGoodType(int id) {
        return null;
    }

    @Override
    public GoodType updateGoodType(GoodType goodType) {
        return null;
    }

    @Override
    public GoodType deleteGoodType(int id) {
        return null;
    }

    @Override
    public List<GoodType> getAll() {
        return null;
    }
}
