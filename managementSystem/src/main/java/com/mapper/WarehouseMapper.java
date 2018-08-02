package com.mapper;

import com.model.Goods;
import com.model.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseMapper {
    public List<Warehouse> selectAll(); // 获取全部数据
    public void update(Warehouse warehouse); //更新
    public void add(Warehouse warehouse); //添加
    public void delete(int id); //删除
    public List<Goods> getWarehouseMess(int id); //获取详细信息
}
