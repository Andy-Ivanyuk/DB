package com.voblaweb.photo.service.servicesupplies;

import com.voblaweb.photo.model.ServiceSupplies;
import com.voblaweb.photo.repository.ServiceSuppliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSuppliesService implements IServiceSuppliesService {

    @Autowired
    ServiceSuppliesRepository repository;

    @Override
    public List<ServiceSupplies> getAll() {
        return repository.findAll();
    }

    @Override
    public ServiceSupplies insert(ServiceSupplies serviceSupplies) {
        return repository.save(serviceSupplies);
    }

    @Override
    public ServiceSupplies update(ServiceSupplies serviceSupplies) {
        return repository.save(serviceSupplies);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
