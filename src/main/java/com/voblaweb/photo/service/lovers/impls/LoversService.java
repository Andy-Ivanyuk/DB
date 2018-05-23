package com.voblaweb.photo.service.lovers.impls;

import com.voblaweb.photo.DAO.lovers.impls.LoversDAOFakeImpl;
import com.voblaweb.photo.model.Lovers;
import com.voblaweb.photo.service.lovers.interfaces.ILoversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoversService implements ILoversService {

    @Autowired
    LoversDAOFakeImpl loversDAOFake;

    @Override
    public Lovers insertLovers(Lovers lover) {
        return null;
    }

    @Override
    public Lovers getLovers(int id) {
        return null;
    }

    @Override
    public Lovers updateLovers(Lovers lover) {
        return null;
    }

    @Override
    public Lovers deleteLovers(int id) {
        return null;
    }

    @Override
    public List<Lovers> getAll() {
        return null;
    }
}
