package com.voblaweb.photo.service.kiosks.interfaces;

import com.voblaweb.photo.model.Kiosks;

import java.util.List;

public interface IKiosksService {
    public Kiosks insertKiosks(Kiosks kiosk);
    public Kiosks getKiosks(int id);
    public Kiosks updateKiosks(Kiosks kiosk);
    public Kiosks deleteKiosks(int id);
    public List<Kiosks> getAll();
}
