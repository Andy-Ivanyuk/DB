package com.voblaweb.photo.DAO.clients.impls;

import com.voblaweb.photo.DAO.clients.interfaces.IClientsDAO;
import com.voblaweb.photo.datastorage.DataStorageFake;
import com.voblaweb.photo.model.Branches;
import com.voblaweb.photo.model.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ClientsDAOFakeImpl implements IClientsDAO {

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Clients insertClients(Clients client) {
        return null;

//        dataStorage.getAnimalCaretakers().add(animalCaretaker);
//        return animalCaretaker;
    }

    @Override
    public Clients getClients(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public Clients updateClients(Clients client) {
        return null;

//        for(AnimalCaretaker animalCaretaker1: dataStorage.getAnimalCaretakers())
//        {
//            if(animalCaretaker1.getId() == animalCaretaker.getId())
//            {
//                animalCaretaker1.setAnimalType(animalCaretaker.getAnimalType());
//                animalCaretaker1.setEmployee(animalCaretaker.getEmployee());
//                break;
//            }
//        }
//        return  animalCaretaker;
    }

    @Override
    public Clients deleteClients(int id) {
        return null;

//        AnimalCaretaker AnimalCaretaker = dataStorage.getAnimalCaretakers()
//                .stream()
//                .filter(el -> el.getId() == id)
//                .findFirst()
//                .get();
//        dataStorage.getAnimalCaretakers().remove(AnimalCaretaker);
//        return  AnimalCaretaker;
    }

    @Override
    public List<Clients> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
