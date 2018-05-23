package com.voblaweb.photo.service.professionals;

import com.voblaweb.photo.model.Professionals;

import java.util.List;

public interface IProfessionalsService {
    List<Professionals> getAll();
    Professionals insert(Professionals professionals);
    Professionals update(Professionals professionals);
    void deleteById(int id);
}
