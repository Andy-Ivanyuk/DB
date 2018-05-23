package com.voblaweb.photo.service.clients;

import com.voblaweb.photo.model.Clients;

import java.util.List;

public interface IClientsService {
    List<Clients> getAll();
    Clients insert(Clients clients);
    Clients update(Clients clients);
    void deleteById(int id);
}
