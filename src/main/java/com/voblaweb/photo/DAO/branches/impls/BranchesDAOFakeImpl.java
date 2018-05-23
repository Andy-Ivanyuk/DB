package com.voblaweb.photo.DAO.branches.impls;

import com.voblaweb.photo.DAO.branches.interfaces.IBranchesDAO;
import com.voblaweb.photo.datastorage.DataStorageJDBC;
import com.voblaweb.photo.model.Branches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component
public class BranchesDAOFakeImpl implements IBranchesDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    @Override
    public Branches insertBranches(Branches branch) throws SQLException {
        String sql = "INSERT INTO `information system for photo branches`.branches " +
                "(branch_address,branch_amount_of_workplaces) VALUES (?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setString(1, branch.get);
        statement.setInt(2, coach.getSportClub().getId());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return branch;
        else
            return null;
    }

    @Override
    public Branches getBranches(int id) {
        return null;

//        return dataStorage.getAnimalCaretakers().stream()
//                .filter(el->el.getId()==id)
//                .findFirst().orElse(null);
    }

    @Override
    public Branches updateBranches(Branches branch) {
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
    public Branches deleteBranches(int id) {
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
    public List<Branches> getAll() {
        return null;
//        return dataStorage.getAnimalCaretakers();
    }
}
