package com.voblaweb.photo.service.branches.interfaces;

import com.voblaweb.photo.model.Branches;

import java.util.List;

public interface IBranchesService {
    public Branches insertBranches(Branches branch);
    public Branches getBranches(int id);
    public Branches updateBranches(Branches branch);
    public Branches deleteBranches(int id);
    public List<Branches> getAll();
}
