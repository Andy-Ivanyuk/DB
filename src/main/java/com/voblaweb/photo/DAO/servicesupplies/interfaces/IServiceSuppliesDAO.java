package com.voblaweb.photo.DAO.servicesupplies.interfaces;

import com.voblaweb.photo.model.ServiceSupplies;

import java.util.List;

public interface IServiceSuppliesDAO {
    public ServiceSupplies insertServiceSupplies(ServiceSupplies serviceSupply);
    public ServiceSupplies getServiceSupplies(int id);
    public ServiceSupplies updateServiceSupplies(ServiceSupplies serviceSupply);
    public ServiceSupplies deleteServiceSupplies(int id);
    public List<ServiceSupplies> getAll();
}
