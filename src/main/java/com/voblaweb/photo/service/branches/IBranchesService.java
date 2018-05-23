package com.voblaweb.photo.service.branches;

import com.voblaweb.photo.model.Branches;

import java.util.List;

public interface IBranchesService {
    List<Branches> getAll();
    Branches insert(Branches branches);
    Branches update(Branches branches);
    void deleteById(int id);
}