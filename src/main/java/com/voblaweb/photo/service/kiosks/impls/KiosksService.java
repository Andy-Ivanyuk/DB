package com.voblaweb.photo.service.kiosks.impls;

import com.voblaweb.photo.DAO.kiosks.impls.KiosksDAOFakeImpl;
import com.voblaweb.photo.model.Kiosks;
import com.voblaweb.photo.service.kiosks.interfaces.IKiosksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiosksService implements IKiosksService {

    @Autowired
    KiosksDAOFakeImpl kiosksDAOFake;

    @Override
    public Kiosks insertKiosks(Kiosks kiosk) {
        return null;
    }

    @Override
    public Kiosks getKiosks(int id) {
        return null;
    }

    @Override
    public Kiosks updateKiosks(Kiosks kiosk) {
        return null;
    }

    @Override
    public Kiosks deleteKiosks(int id) {
        return null;
    }

    @Override
    public List<Kiosks> getAll() {
        return null;
    }
}
