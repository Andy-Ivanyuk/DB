package com.voblaweb.photo.DAO.servicesupplies.impls;

import com.voblaweb.photo.DAO.servicesupplies.interfaces.IServiceSuppliesDAO;
import com.voblaweb.photo.datastorage.DataStorageFake;
import com.voblaweb.photo.model.ServiceSupplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ServiceSuppliesDAOFakeImpl implements IServiceSuppliesDAO {

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public ServiceSupplies insertServiceSupplies(ServiceSupplies serviceSupply) {
        return null;

//        dataStorage.getAnimalCaretakers().add(animalCaretaker);
//        return animalCaretaker;
    }

    @Override
    public ServiceSupplies getServiceSupplies(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public ServiceSupplies updateServiceSupplies(ServiceSupplies serviceSupply) {
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
    public ServiceSupplies deleteServiceSupplies(int id) {
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
    public List<ServiceSupplies> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
