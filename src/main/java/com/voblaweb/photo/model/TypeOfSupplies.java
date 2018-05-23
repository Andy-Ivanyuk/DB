package com.voblaweb.photo.model;

public class TypeOfSupplies {
    private int typeId;
    private String nameOfSupply;

    public TypeOfSupplies(int typeId, String nameOfSupply) {
        this.typeId = typeId;
        this.nameOfSupply = nameOfSupply;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getNameOfSupply() {
        return nameOfSupply;
    }

    public void setNameOfSupply(String nameOfSupply) {
        this.nameOfSupply = nameOfSupply;
    }
}
