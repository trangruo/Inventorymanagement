package com.service;

import com.mapper.GoodsMapper;
import com.model.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {

    @Resource
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
