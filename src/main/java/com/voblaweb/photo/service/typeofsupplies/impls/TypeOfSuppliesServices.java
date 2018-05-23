package com.voblaweb.photo.service.typeofsupplies.impls;

import com.voblaweb.photo.DAO.typeofsupplies.impls.TypeOfSuppliesDAOFakeImpl;
import com.voblaweb.photo.model.TypeOfSupplies;
import com.voblaweb.photo.service.typeofsupplies.interfaces.ITypeOfSuppliesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfSuppliesServices implements ITypeOfSuppliesServices {

    @Autowired
    TypeOfSuppliesDAOFakeImpl typeOfSuppliesDAOFake;

    @Override
    public TypeOfSupplies insertTypeOfSupplies(TypeOfSupplies typeOfSupply) {
        return null;
    }

    @Override
    public TypeOfSupplies getTypeOfSupplies(int id) {
        return null;
    }

    @Override
    public TypeOfSupplies updateTypeOfSupplies(TypeOfSupplies typeOfSupply) {
        return null;
    }

    @Override
    public TypeOfSupplies deleteTypeOfSupplies(int id) {
        return null;
    }

    @Override
    public List<TypeOfSupplies> getAll() {
        return null;
    }
}
