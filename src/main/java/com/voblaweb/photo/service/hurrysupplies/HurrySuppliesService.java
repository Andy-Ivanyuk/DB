package com.voblaweb.photo.service.hurrysupplies;

import com.voblaweb.photo.model.HurrySupplies;
import com.voblaweb.photo.repository.HurrySuppliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HurrySuppliesService implements IHurrySuppliesService {

    @Autowired
    HurrySuppliesRepository repository;

    @Override
    public List<HurrySupplies> getAll() {
        return repository.findAll();
    }

    @Override
    public HurrySupplies insert(HurrySupplies hurrySupplies) {
        return repository.save(hurrySupplies);
    }

    @Override
    public HurrySupplies update(HurrySupplies hurrySupplies) {
        return repository.save(hurrySupplies);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
