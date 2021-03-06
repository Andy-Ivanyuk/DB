package com.voblaweb.photo.service.officeorders.interfaces;

import com.voblaweb.photo.model.OfficeOrders;

import java.util.List;

public interface IOfficeOrdersService {
    public OfficeOrders insertOfficeOrders(OfficeOrders officeOrder);
    public OfficeOrders getOfficeOrders(int id);
    public OfficeOrders updateOfficeOrders(OfficeOrders officeOrder);
    public OfficeOrders deleteOfficeOrders(int id);
    public List<OfficeOrders> getAll();
}
