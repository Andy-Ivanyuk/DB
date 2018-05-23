package com.voblaweb.photo.DAO.branches.interfaces;

import com.voblaweb.photo.model.Branches;

import java.sql.SQLException;
import java.util.List;

public interface IBranchesDAO {
    public Branches insertBranches(Branches branch) throws SQLException;
    public Branches getBranches(int id);
    public Branches updateBranches(Branches branch);
    public Branches deleteBranches(int id);
    public List<Branches> getAll();
}
