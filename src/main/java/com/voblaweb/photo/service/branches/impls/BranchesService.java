package com.voblaweb.photo.service.branches.impls;

import com.voblaweb.photo.DAO.branches.impls.BranchesDAOFakeImpl;
import com.voblaweb.photo.model.Branches;
import com.voblaweb.photo.service.branches.interfaces.IBranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesService implements IBranchesService {

    @Autowired
    BranchesDAOFakeImpl branchesDAOFake;

    @Override
    public Branches insertBranches(Branches branch) {
        return null;

//        coachDAO.insertCoach(coach);
    }

    @Override
    public Branches getBranches(int id) {
        return null;

//        return coachDAO.getCoach(id);
    }

    @Override
    public Branches updateBranches(Branches branch) {
        return null;

//        return coachDAO.updateCoach(coach);
    }

    @Override
    public Branches deleteBranches(int id) {
        return null;

//        return coachDAO.deleteCoach(id);
    }

    @Override
    public List<Branches> getAll() {
        return null;

//        return coachDAO.getAll();
    }
}
