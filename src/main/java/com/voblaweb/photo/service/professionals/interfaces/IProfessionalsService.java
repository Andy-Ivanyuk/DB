package com.voblaweb.photo.service.professionals.interfaces;

import com.voblaweb.photo.model.Professionals;

import java.util.List;

public interface IProfessionalsService {
    public Professionals insertProfessionals(Professionals professional);
    public Professionals getProfessionals(int id);
    public Professionals updateProfessionals(Professionals professional);
    public Professionals deleteProfessionals(int id);
    public List<Professionals> getAll();
}
