package com.voblaweb.photo.service.officeorders.impls;

import com.voblaweb.photo.DAO.officeorders.impls.OfficeOrdersDAOFakeImpl;
import com.voblaweb.photo.model.OfficeOrders;
import com.voblaweb.photo.service.officeorders.interfaces.IOfficeOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeOrdersService implements IOfficeOrdersService {

    @Autowired
    OfficeOrdersDAOFakeImpl officeOrdersDAOFake;

    @Override
    public OfficeOrders insertOfficeOrders(OfficeOrders officeOrder) {
        return null;
    }

    @Override
    public OfficeOrders getOfficeOrders(int id) {
        return null;
    }

    @Override
    public OfficeOrders updateOfficeOrders(OfficeOrders officeOrder) {
        return null;
    }

    @Override
    public OfficeOrders deleteOfficeOrders(int id) {
        return null;
    }

    @Override
    public List<OfficeOrders> getAll() {
        return null;
    }
}
