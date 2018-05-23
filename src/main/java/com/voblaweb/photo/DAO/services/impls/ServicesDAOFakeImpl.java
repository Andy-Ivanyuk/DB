package com.voblaweb.photo.DAO.services.impls;

import com.voblaweb.photo.DAO.services.interfaces.IServicesDAO;
import com.voblaweb.photo.datastorage.DataStorageFake;
import com.voblaweb.photo.model.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ServicesDAOFakeImpl implements IServicesDAO {

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Services insertServices(Services service) {
        return null;

//        dataStorage.getAnimalCaretakers().add(animalCaretaker);
//        return animalCaretaker;
    }

    @Override
    public Services getServices(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public Services updateServices(Services service) {
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
    public Services deleteServices(int id) {
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
    public List<Services> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
