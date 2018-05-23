package com.voblaweb.photo.model;

import java.util.Date;

public class ServiceSupplies {
    private int serviceSuppliesId;
    private Date date;
    private int kiosksKioskId;
    private int servicesServiceId;
    private int clientsClientId;

    public ServiceSupplies(int serviceSuppliesId, Date date, int kiosksKioskId, int servicesServiceId, int clientsClientId) {
        this.serviceSuppliesId = serviceSuppliesId;
        this.date = date;
        this.kiosksKioskId = kiosksKioskId;
        this.servicesServiceId = servicesServiceId;
        this.clientsClientId = clientsClientId;
    }

    public int getServiceSuppliesId() {
        return serviceSuppliesId;
    }

    public void setServiceSuppliesId(int serviceSuppliesId) {
        this.serviceSuppliesId = serviceSuppliesId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getKiosksKioskId() {
        return kiosksKioskId;
    }

    public void setKiosksKioskId(int kiosksKioskId) {
        this.kiosksKioskId = kiosksKioskId;
    }

    public int getServicesServiceId() {
        return servicesServiceId;
    }

    public void setServicesServiceId(int servicesServiceId) {
        this.servicesServiceId = servicesServiceId;
    }

    public int getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(int clientsClientId) {
        this.clientsClientId = clientsClientId;
    }
}
