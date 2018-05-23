package com.voblaweb.photo.service.typeofsupplies.interfaces;

import com.voblaweb.photo.model.TypeOfSupplies;

import java.util.List;

public interface ITypeOfSuppliesServices {
    public TypeOfSupplies insertTypeOfSupplies(TypeOfSupplies typeOfSupply);
    public TypeOfSupplies getTypeOfSupplies(int id);
    public TypeOfSupplies updateTypeOfSupplies(TypeOfSupplies typeOfSupply);
    public TypeOfSupplies deleteTypeOfSupplies(int id);
    public List<TypeOfSupplies> getAll();
}
