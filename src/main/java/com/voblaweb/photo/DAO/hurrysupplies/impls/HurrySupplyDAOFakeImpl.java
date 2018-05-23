package com.voblaweb.photo.DAO.hurrysupplies.impls;

import com.voblaweb.photo.DAO.hurrysupplies.interfaces.IHurrySuppliesDAO;
import com.voblaweb.photo.datastorage.DataStorageFake;
import com.voblaweb.photo.model.HurrySupplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class HurrySupplyDAOFakeImpl implements IHurrySuppliesDAO {

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public HurrySupplies insertHurrySupplies(HurrySupplies hurrySupply) {
        return null;

//        dataStorage.getAnimalCaretakers().add(animalCaretaker);
//        return animalCaretaker;
    }

    @Override
    public HurrySupplies getHurrySupplies(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public HurrySupplies updateHurrySupplies(HurrySupplies hurrySupply) {
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
    public HurrySupplies deleteHurrySupplies(int id) {
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
    public List<HurrySupplies> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
