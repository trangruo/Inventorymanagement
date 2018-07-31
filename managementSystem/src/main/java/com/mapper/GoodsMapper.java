package com.mapper;

import com.model.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    public List<Goods> selectAllGoods(); // 获取全部数据
    public void updateGoods(Goods goods); //更新货物信息
    public void addGoods(Goods goods); //添加货物
    public void deleteGoods(int id); //删除货物

}
