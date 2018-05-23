package com.voblaweb.photo.DAO.typeofsupplies.impls;

import com.voblaweb.photo.DAO.typeofsupplies.interfaces.ITypeOfSuppliesDAO;
import com.voblaweb.photo.datastorage.DataStorageFake;
import com.voblaweb.photo.model.TypeOfSupplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class TypeOfSuppliesDAOFakeImpl implements ITypeOfSuppliesDAO {

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public TypeOfSupplies insertTypeOfSupplies(TypeOfSupplies typeOfSupply) {
        return null;

//        dataStorage.getAnimalCaretakers().add(animalCaretaker);
//        return animalCaretaker;
    }

    @Override
    public TypeOfSupplies getTypeOfSupplies(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public TypeOfSupplies updateTypeOfSupplies(TypeOfSupplies typeOfSupply) {
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
    public TypeOfSupplies deleteTypeOfSupplies(int id) {
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
    public List<TypeOfSupplies> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
