package com.voblaweb.photo.service.lovers;

import com.voblaweb.photo.model.Lovers;

import java.util.List;

public interface ILoversService {
    List<Lovers> getAll();
    Lovers insert(Lovers lovers);
    Lovers update(Lovers lovers);
    void deleteById(int id);
}
