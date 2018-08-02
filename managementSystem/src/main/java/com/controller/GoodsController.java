package com.controller;

import com.model.Goods;
import com.service.GoodsService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GoodsController {

    private static Logger logger = Logger.getLogger(GoodsController.class);
    @Resource
    private GoodsService goodsService;

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping("stock.action")
    public ModelAndView select() {
        logger.info("查询所有的货物信息");
        List<Goods> goodsList=goodsService.selectAllGoods();

        ModelAndView modelAndView = new ModelAndView("../static/assets/pages/stock");
        modelAndView.addObject("goodsList", goodsList);
        return modelAndView;
    }

    @RequestMapping("addGoods.action")
    public ModelAndView addGoods(@RequestParam("goods_id2") String id,
                                 @RequestParam("goods_name2") String name,
                                 @RequestParam("goods_number2") String number,
                                 @RequestParam("goods_w_id2") String w_id){
        ModelAndView mav = new ModelAndView("../static/assets/pages/stock");
        Goods goods = new Goods(Integer.parseInt(id), name, Integer.parseInt(number), Integer.parseInt(w_id));
        logger.info(goods.toString());
        goodsService.addGoods(goods);
        List<Goods> goodsList=goodsService.selectAllGoods();
        mav.addObject("goodsList", goodsList);
        return mav;
    }

    @RequestMapping("updateGoods.action")
    public ModelAndView updateGoods(@RequestParam("goods_id") String id,
                                    @RequestParam("goods_name") String name,
                                    @RequestParam("goods_number") String number,
                                    @RequestParam("goods_w_id") String w_id){
        ModelAndView mav = new ModelAndView("../static/assets/pages/stock");
        Goods goods = new Goods(Integer.parseInt(id), name, Integer.parseInt(number), Integer.parseInt(w_id));
        logger.info(goods.toString());
        goodsService.updateGoods(goods);
        List<Goods> goodsList=goodsService.selectAllGoods();
        mav.addObject("goodsList", goodsList);
        return mav;
    }

    @RequestMapping("deleteGoods.action")
    public ModelAndView deleteGoods(@RequestParam("delete_id") String id){
        ModelAndView mav = new ModelAndView("../static/assets/pages/stock");
        logger.info("--------delete-------");
        goodsService.deleteGoods(Integer.parseInt(id));
        List<Goods> goodsList=goodsService.selectAllGoods();
        mav.addObject("goodsList", goodsList);
        return mav;
    }

}
