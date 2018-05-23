package com.voblaweb.photo.model;

public class Professionals {
    private int professionalId;
    private int clientsClientId;
    private Boolean personalDiscount;

    public Professionals(int professionalId, int clientsClientId, Boolean personalDiscount) {
        this.professionalId = professionalId;
        this.clientsClientId = clientsClientId;
        this.personalDiscount = personalDiscount;
    }

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public int getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(int clientsClientId) {
        this.clientsClientId = clientsClientId;
    }

    public Boolean getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(Boolean personalDiscount) {
        this.personalDiscount = personalDiscount;
    }
}
