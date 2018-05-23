package com.voblaweb.photo.service.servicesupplies;

import com.voblaweb.photo.model.ServiceSupplies;

import java.util.List;

public interface IServiceSuppliesService {
    List<ServiceSupplies> getAll();
    ServiceSupplies insert(ServiceSupplies serviceSupplies);
    ServiceSupplies update(ServiceSupplies serviceSupplies);
    void deleteById(int id);
}
