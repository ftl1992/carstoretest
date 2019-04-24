package com.controller;

import com.po.BrandUpdateVo;
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
@RequestMapping("/update")
public class UpdateController {
    @Autowired
    private Service service=new ServiceImpl();

    @RequestMapping("/updateBrand")
    public ModelAndView updateBrand(@RequestParam(value = "brandName",required = true) String brandName) throws Exception{
        List<TbBrand> tbBrandList = (List<TbBrand>) service.selectByBrandname(brandName);
        // ����ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.clear();
        modelAndView.addObject("tbBrandList", tbBrandList);
        modelAndView.setViewName("updateBrand");
        return modelAndView;
    }
    @RequestMapping("/updateBrandSubmit")
    public ModelAndView updateBrandSubmit(TbBrand tbBrand) throws Exception{
        int b =service.updateBrandSubmit(tbBrand);
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







    @RequestMapping("/updateSeries")
    public ModelAndView updateSeries(@RequestParam(value = "seriesName",required = true) String seriesName) throws Exception{
        List<TbSeries> tbSeriesList = (List<TbSeries>) service.selectBySeriesname(seriesName);
        // ����ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.clear();
        modelAndView.addObject("tbSeriesList", tbSeriesList);
        modelAndView.setViewName("updateSeries");
        return modelAndView;
    }
    @RequestMapping("/updateSeriesSubmit")
    public ModelAndView updateSeriesSubmit(TbSeries tbSeries, String brandCode) throws Exception{
        int b =service.updateSeriesSubmit(tbSeries);
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




    @RequestMapping("/updateModel")
    public ModelAndView updateModel(@RequestParam(value = "modelName",required = true) String modelName) throws Exception{
        List<TbModel> tbModelList = (List<TbModel>) service.selectByModelname(modelName);
        // ����ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.clear();
        modelAndView.addObject("tbModelList", tbModelList);
        modelAndView.setViewName("updateModel");
        return modelAndView;
    }
    @RequestMapping("/updateModelSubmit")
    public ModelAndView updateModelSubmit(TbModel tbModel,String seriesCode) throws Exception{
        int b =service.updateModelSubmit(tbModel);
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


}
