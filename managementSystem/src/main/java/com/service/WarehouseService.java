package com.service;

import com.mapper.WarehouseMapper;
import com.model.Goods;
import com.model.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseService {
    @Resource
    private WarehouseMapper warehouseMapper;

    public List<Warehouse> selectAll() {
        return warehouseMapper.selectAll();
    }

    public void update(Warehouse warehouse) {
        warehouseMapper.update(warehouse);
    }

    public void add(Warehouse warehouse) {
        warehouseMapper.add(warehouse);
    }

    public void delete(int id) {
        warehouseMapper.delete(id);
    }

    public List<Goods> getWarehouseMess(int id) {
        return warehouseMapper.getWarehouseMess(id);
    }


}
