package com.voblaweb.photo.DAO.services.interfaces;

import com.voblaweb.photo.model.Services;

import java.util.List;

public interface IServicesDAO {
    public Services insertServices(Services service);
    public Services getServices(int id);
    public Services updateServices(Services service);
    public Services deleteServices(int id);
    public List<Services> getAll();
}
