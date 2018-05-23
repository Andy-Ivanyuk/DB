package com.voblaweb.photo.DAO.kiosks.impls;

import com.voblaweb.photo.DAO.kiosks.interfaces.IKiosksDAO;
import com.voblaweb.photo.datastorage.DataStorageFake;
import com.voblaweb.photo.model.Kiosks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class KiosksDAOFakeImpl implements IKiosksDAO {

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Kiosks insertKiosks(Kiosks kiosk) {
        return null;

//        dataStorage.getAnimalCaretakers().add(animalCaretaker);
//        return animalCaretaker;
    }

    @Override
    public Kiosks getKiosks(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public Kiosks updateKiosks(Kiosks kiosk) {
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
    public Kiosks deleteKiosks(int id) {
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
    public List<Kiosks> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
