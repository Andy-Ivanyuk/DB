package com.voblaweb.photo.service.hurrysupplies.interfaces;

import com.voblaweb.photo.model.HurrySupplies;

import java.util.List;

public interface IHurrySuppliesService {
    public HurrySupplies insertHurrySupplies(HurrySupplies hurrySupply);
    public HurrySupplies getHurrySupplies(int id);
    public HurrySupplies updateHurrySupplies(HurrySupplies hurrySupply);
    public HurrySupplies deleteHurrySupplies(int id);
    public List<HurrySupplies> getAll();
}
