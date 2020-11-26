package com.clothesPlatform.controller;

import com.clothesPlatform.entity.Clothing;
import com.clothesPlatform.service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClothingController {
    @Autowired
    private ClothingService clothingService;

    //返回所有的服装数据
    @RequestMapping("findAllClothing")
    @ResponseBody
    public List<Clothing> findAllClothing(){
        return clothingService.findAll();
    }

    //添加一件服装
    @RequestMapping("/addClothing")
    public String addClothing(@RequestParam("type") String type, @RequestParam("descriptio" +
            "n") String description,@RequestParam("rent") Integer rent,@RequestParam("belong") String belong){
        Clothing clothing = new Clothing();
        clothing.setType(type);
        clothing.setDescription(description);
        clothing.setRent(rent);
        clothing.setBelong(belong);
        if (clothingService.saveClothing(clothing)) {
            return "success";//暂且用成功界面代替
        }else {
            return "error";
        }
    }
    //删除一件服装

    //根据服装类型查找服装



}
