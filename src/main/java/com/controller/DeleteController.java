package com.controller;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;
import com.service.Service;
import com.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/delete")
public class DeleteController {
    @Autowired
    private Service service=new ServiceImpl();


    @RequestMapping("/deleteByModelName")
    public ModelAndView deleteByModelName(@RequestParam(value = "seriesCode",required = true) String seriesCode,@RequestParam(value = "modelName",required = true) String modelName) throws Exception{
        int b =service.deleteByModelName(modelName);
        if (b!=0){
            List<TbModel> tbModelList = (List<TbModel>) service.selectBySeries_code(seriesCode);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.addObject("tbModelList", tbModelList);
            modelAndView.setViewName("modelSelect");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.setViewName("error");
            return modelAndView;
        }
    }




    @RequestMapping("/deleteBySeriesName")
    public ModelAndView deleteBySeriesName(@RequestParam(value = "brandCode",required = true) String brandCode,@RequestParam(value = "seriesName",required = true) String seriesName) throws Exception{
        int b =service.deleteBySeriesName(seriesName);
        if (b!=0){
            List<TbSeries> tbSeriesList = (List<TbSeries>) service.selectByBrand_code(brandCode);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.addObject("tbSeriesList", tbSeriesList);
            modelAndView.setViewName("seriesSelect");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.setViewName("error");
            return modelAndView;
        }
    }





    @RequestMapping("/deleteByBrandName")
    public ModelAndView deleteByBrandName(@RequestParam(value = "brandName",required = true) String brandName ) throws Exception{
        int b =service.deleteByBrandName(brandName);
        if (b!=0){
            List<TbBrand> tbBrandList = (List<TbBrand>) service.searchAllBrand();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.addObject("tbBrandList", tbBrandList);
            modelAndView.setViewName("brandSelect");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.setViewName("error");
            return modelAndView;
        }
    }
}
