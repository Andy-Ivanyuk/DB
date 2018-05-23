package com.voblaweb.photo.service.officeorders;

import com.voblaweb.photo.model.OfficeOrders;
import com.voblaweb.photo.repository.OfficeOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeOrdersService implements IOfficeOrdersService {

    @Autowired
    OfficeOrdersRepository repository;

    @Override
    public List<OfficeOrders> getAll() {
        return repository.findAll();
    }

    @Override
    public OfficeOrders insert(OfficeOrders officeOrders) {
        return repository.save(officeOrders);
    }

    @Override
    public OfficeOrders update(OfficeOrders officeOrders) {
        return repository.save(officeOrders);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
