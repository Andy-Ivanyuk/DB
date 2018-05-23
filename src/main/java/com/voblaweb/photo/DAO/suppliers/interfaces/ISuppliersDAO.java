package com.voblaweb.photo.DAO.suppliers.interfaces;

import com.voblaweb.photo.model.Suppliers;

import java.util.List;

public interface ISuppliersDAO {
    public Suppliers insertSuppliers(Suppliers supplier);
    public Suppliers getSuppliers(int id);
    public Suppliers updateSuppliers(Suppliers supplier);
    public Suppliers deleteSuppliers(int id);
    public List<Suppliers> getAll();
}
