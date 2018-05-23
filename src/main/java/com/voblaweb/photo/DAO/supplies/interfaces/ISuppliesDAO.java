package com.voblaweb.photo.DAO.supplies.interfaces;

import com.voblaweb.photo.model.Supplies;

import java.util.List;

public interface ISuppliesDAO {
    public Supplies insertSupplies(Supplies supply);
    public Supplies getSupplies(int id);
    public Supplies updateSupplies(Supplies supply);
    public Supplies deleteSupplies(int id);
    public List<Supplies> getAll();
}
