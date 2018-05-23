package com.voblaweb.photo.DAO.clients.interfaces;

import com.voblaweb.photo.model.Clients;

import java.util.List;

public interface IClientsDAO {
    public Clients insertClients(Clients client);
    public Clients getClients(int id);
    public Clients updateClients(Clients client);
    public Clients deleteClients(int id);
    public List<Clients> getAll();
}
