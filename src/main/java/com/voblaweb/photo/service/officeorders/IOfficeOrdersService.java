package com.voblaweb.photo.service.officeorders;

import com.voblaweb.photo.model.OfficeOrders;

import java.util.List;

public interface IOfficeOrdersService {
    List<OfficeOrders> getAll();
    OfficeOrders insert(OfficeOrders officeOrders);
    OfficeOrders update(OfficeOrders officeOrders);
    void deleteById(int id);
}
