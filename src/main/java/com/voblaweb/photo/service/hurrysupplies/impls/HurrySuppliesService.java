package com.voblaweb.photo.service.hurrysupplies.impls;

import com.voblaweb.photo.DAO.hurrysupplies.impls.HurrySupplyDAOFakeImpl;
import com.voblaweb.photo.model.HurrySupplies;
import com.voblaweb.photo.service.hurrysupplies.interfaces.IHurrySuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HurrySuppliesService implements IHurrySuppliesService {

    @Autowired
    HurrySupplyDAOFakeImpl hurrySupplyDAOFake;

    @Override
    public HurrySupplies insertHurrySupplies(HurrySupplies hurrySupply) {
        return null;
    }

    @Override
    public HurrySupplies getHurrySupplies(int id) {
        return null;
    }

    @Override
    public HurrySupplies updateHurrySupplies(HurrySupplies hurrySupply) {
        return null;
    }

    @Override
    public HurrySupplies deleteHurrySupplies(int id) {
        return null;
    }

    @Override
    public List<HurrySupplies> getAll() {
        return null;
    }
}
