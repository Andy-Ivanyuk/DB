package com.voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@EntityListeners(AuditingEntityListener.class)
public class Clients {


    @Id
    @Column(name = "client_id")
    private int clientId;
    private String branchName;
    private Boolean discountCard;
    @ManyToOne
    private Branches branchesBranchId;

    public Clients(String branchName, Boolean discountCard, Branches branchesBranchId) {
        this.branchName = branchName;
        this.discountCard = discountCard;
        this.branchesBranchId = branchesBranchId;
    }

    public Clients() {
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

    public Branches getBranchesBranchId() {
        return branchesBranchId;
    }

    public void setBranchesBranchId(Branches branchesBranchId) {
        this.branchesBranchId = branchesBranchId;
    }
}
