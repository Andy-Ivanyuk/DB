package com.voblaweb.photo.DAO.kiosks.interfaces;

import com.voblaweb.photo.model.Kiosks;

import java.util.List;

public interface IKiosksDAO {
    public Kiosks insertKiosks(Kiosks kiosk);
    public Kiosks getKiosks(int id);
    public Kiosks updateKiosks(Kiosks kiosk);
    public Kiosks deleteKiosks(int id);
    public List<Kiosks> getAll();
}
