package com.voblaweb.photo.service.supplies.impls;

import com.voblaweb.photo.DAO.supplies.impls.SuppliesDAOFakeImpl;
import com.voblaweb.photo.model.Supplies;
import com.voblaweb.photo.service.supplies.interfaces.ISuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliesService implements ISuppliesService {

    @Autowired
    SuppliesDAOFakeImpl suppliesDAOFake;

    @Override
    public Supplies insertSupplies(Supplies supply) {
        return null;
    }

    @Override
    public Supplies getSupplies(int id) {
        return null;
    }

    @Override
    public Supplies updateSupplies(Supplies supply) {
        return null;
    }

    @Override
    public Supplies deleteSupplies(int id) {
        return null;
    }

    @Override
    public List<Supplies> getAll() {
        return null;
    }
}
