package com.voblaweb.photo.service.servicesupplies.impls;

import com.voblaweb.photo.DAO.servicesupplies.impls.ServiceSuppliesDAOFakeImpl;
import com.voblaweb.photo.model.ServiceSupplies;
import com.voblaweb.photo.service.servicesupplies.interfaces.IServiceSuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSuppliesService implements IServiceSuppliesService {

    @Autowired
    ServiceSuppliesDAOFakeImpl serviceSuppliesDAOFake;

    @Override
    public ServiceSupplies insertServiceSupplies(ServiceSupplies serviceSupply) {
        return null;
    }

    @Override
    public ServiceSupplies getServiceSupplies(int id) {
        return null;
    }

    @Override
    public ServiceSupplies updateServiceSupplies(ServiceSupplies serviceSupply) {
        return null;
    }

    @Override
    public ServiceSupplies deleteServiceSupplies(int id) {
        return null;
    }

    @Override
    public List<ServiceSupplies> getAll() {
        return null;
    }
}
