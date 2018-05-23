package com.voblaweb.photo.model;

public class Branches {
    private int branchId;
    private String branchAddress;
    private int branchAmountOfWorkplaces;

    public Branches(int branchId, String branchAddress, int branchAmountOfWorkplaces) {
        this.branchId = branchId;
        this.branchAddress = branchAddress;
        this.branchAmountOfWorkplaces = branchAmountOfWorkplaces;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public int getBranchAmountOfWorkplaces() {
        return branchAmountOfWorkplaces;
    }

    public void setBranchAmountOfWorkplaces(int branchAmountOfWorkplaces) {
        this.branchAmountOfWorkplaces = branchAmountOfWorkplaces;
    }
}
