package com.voblaweb.photo.service.servicesupplies.interfaces;

import com.voblaweb.photo.model.ServiceSupplies;

import java.util.List;

public interface IServiceSuppliesService {
    public ServiceSupplies insertServiceSupplies(ServiceSupplies serviceSupply);
    public ServiceSupplies getServiceSupplies(int id);
    public ServiceSupplies updateServiceSupplies(ServiceSupplies serviceSupply);
    public ServiceSupplies deleteServiceSupplies(int id);
    public List<ServiceSupplies> getAll();
}
