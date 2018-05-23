package com.voblaweb.photo.model;

public class Clients {
    private int clientId;
    private String branchName;
    private Boolean discountCard;
    private int branchesBranchId;

    public Clients(int clientId, String branchName, Boolean discountCard, int branchesBranchId) {
        this.clientId = clientId;
        this.branchName = branchName;
        this.discountCard = discountCard;
        this.branchesBranchId = branchesBranchId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Boolean getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(Boolean discountCard) {
        this.discountCard = discountCard;
    }

    public int getBranchesBranchId() {
        return branchesBranchId;
    }

    public void setBranchesBranchId(int branchesBranchId) {
        this.branchesBranchId = branchesBranchId;
    }
}
