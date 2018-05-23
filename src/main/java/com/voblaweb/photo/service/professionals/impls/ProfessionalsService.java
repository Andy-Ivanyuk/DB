package com.voblaweb.photo.service.professionals.impls;

import com.voblaweb.photo.DAO.professionals.impls.ProfessionalsDAOFakeImpl;
import com.voblaweb.photo.model.Professionals;
import com.voblaweb.photo.service.professionals.interfaces.IProfessionalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalsService implements IProfessionalsService {

    @Autowired
    ProfessionalsDAOFakeImpl professionalsDAOFake;

    @Override
    public Professionals insertProfessionals(Professionals professional) {
        return null;
    }

    @Override
    public Professionals getProfessionals(int id) {
        return null;
    }

    @Override
    public Professionals updateProfessionals(Professionals professional) {
        return null;
    }

    @Override
    public Professionals deleteProfessionals(int id) {
        return null;
    }

    @Override
    public List<Professionals> getAll() {
        return null;
    }
}
