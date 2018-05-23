package com.voblaweb.photo.model;

public class Lovers {
    private int loverId;
    private int clientsClientId;

    public Lovers(int loverId, int clientsClientId) {
        this.loverId = loverId;
        this.clientsClientId = clientsClientId;
    }

    public int getLoverId() {
        return loverId;
    }

    public void setLoverId(int loverId) {
        this.loverId = loverId;
    }

    public int getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(int clientsClientId) {
        this.clientsClientId = clientsClientId;
    }
}
