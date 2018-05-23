package com.voblaweb.photo.service.suppliers.impls;

import com.voblaweb.photo.DAO.suppliers.impls.SuppliersDAOFakeImpl;
import com.voblaweb.photo.model.Suppliers;
import com.voblaweb.photo.service.suppliers.interfaces.ISuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliersService implements ISuppliersService {

    @Autowired
    SuppliersDAOFakeImpl suppliersDAOFake;

    @Override
    public Suppliers insertSuppliers(Suppliers supplier) {
        return null;
    }

    @Override
    public Suppliers getSuppliers(int id) {
        return null;
    }

    @Override
    public Suppliers updateSuppliers(Suppliers supplier) {
        return null;
    }

    @Override
    public Suppliers deleteSuppliers(int id) {
        return null;
    }

    @Override
    public List<Suppliers> getAll() {
        return null;
    }
}
