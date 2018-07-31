package com.service;

import com.mapper.GoodsMapper;
import com.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> selectAllGoods(){
        return goodsMapper.selectAllGoods();
    }
    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }
    public void updateGoods(Goods goods) {
        goodsMapper.updateGoods(goods);
    }
    public void deleteGoods(int id) {
        goodsMapper.deleteGoods(id);
    }

}
