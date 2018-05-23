package com.voblaweb.photo.service.services.impls;

import com.voblaweb.photo.DAO.services.impls.ServicesDAOFakeImpl;
import com.voblaweb.photo.model.Services;
import com.voblaweb.photo.service.services.interfaces.IServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService implements IServicesService {

    @Autowired
    ServicesDAOFakeImpl servicesDAOFake;

    @Override
    public Services insertServices(Services service) {
        return null;
    }

    @Override
    public Services getServices(int id) {
        return null;
    }

    @Override
    public Services updateServices(Services service) {
        return null;
    }

    @Override
    public Services deleteServices(int id) {
        return null;
    }

    @Override
    public List<Services> getAll() {
        return null;
    }
}
