package com.voblaweb.photo.service.lovers.interfaces;

import com.voblaweb.photo.model.Lovers;

import java.util.List;

public interface ILoversService {
    public Lovers insertLovers(Lovers lover);
    public Lovers getLovers(int id);
    public Lovers updateLovers(Lovers lover);
    public Lovers deleteLovers(int id);
    public List<Lovers> getAll();
}
