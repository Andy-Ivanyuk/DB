package com.voblaweb.photo.service.clients.impls;

import com.voblaweb.photo.DAO.clients.impls.ClientsDAOFakeImpl;
import com.voblaweb.photo.model.Clients;
import com.voblaweb.photo.service.clients.interfaces.IClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService implements IClientsService {

    @Autowired
    ClientsDAOFakeImpl clientsDAOFake;

    @Override
    public Clients insertClients(Clients client) {
        return null;

//        coachDAO.insertCoach(coach);
    }

    @Override
    public Clients getClients(int id) {
        return null;

//        return coachDAO.getCoach(id);
    }

    @Override
    public Clients updateClients(Clients client) {
        return null;

//        return coachDAO.updateCoach(coach);
    }

    @Override
    public Clients deleteClients(int id) {
        return null;

//        return coachDAO.deleteCoach(id);
    }

    @Override
    public List<Clients> getAll() {
        return null;

//        return coachDAO.getAll();
    }
}
