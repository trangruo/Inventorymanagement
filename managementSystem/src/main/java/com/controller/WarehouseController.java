package com.controller;

import com.model.Goods;
import com.model.Warehouse;
import com.service.WarehouseService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class WarehouseController {
    private static Logger logger = Logger.getLogger(WarehouseController.class);

    @Resource
    private WarehouseService warehouseService;

    @RequestMapping("warehouse.action")
    public ModelAndView ListAll(){
        logger.info("查询所有的仓库信息");
        ModelAndView mav = new ModelAndView("../static/assets/pages/warehouse");

        List<Warehouse> warehouseList = warehouseService.selectAll();
        mav.addObject("warehouseList", warehouseList);
        return mav;
    }

    @RequestMapping("addWarehouse.action")
    public ModelAndView addWarehouse(@RequestParam("warehouse_id") String id,
                                     @RequestParam("warehouse_name") String name,
                                     @RequestParam("warehouse_capacity") String capacity) {
        logger.info("添加新的仓库");
        ModelAndView mav = new ModelAndView("../static/assets/pages/warehouse");
        Warehouse warehouse = new Warehouse(Integer.parseInt(id), name, Integer.parseInt(capacity));
        warehouseService.add(warehouse);
        List<Warehouse> warehouseList = warehouseService.selectAll();
        mav.addObject("warehouseList", warehouseList);
        return mav;
    }

    @RequestMapping("deleteWarehouse.action")
    public ModelAndView deleteGoods(@RequestParam("delete_id") String id){
        ModelAndView mav = new ModelAndView("../static/assets/pages/warehouse");
        logger.info("--------delete-------");
        warehouseService.delete(Integer.parseInt(id));
        List<Warehouse> warehouseList = warehouseService.selectAll();
        mav.addObject("warehouseList", warehouseList);
        return mav;
    }

    @RequestMapping("GetGoodsInfo.action")
    public Map<Integer, Goods> getGoodsInfo(@RequestParam("id") String id) {
        logger.info("----------"+id+"----------");
        List<Goods> goodsList = warehouseService.getWarehouseMess(Integer.parseInt(id));
        for (int i = 0; i < goodsList.size(); i++) {
            logger.info("----------"+goodsList.get(i)+"------------");
        }
        Map<Integer,Goods> map = new HashMap<>();
        for (int i = 0; i < goodsList.size(); i++) {
            map.put(i, goodsList.get(i));
        }
        return map;
    }

}
