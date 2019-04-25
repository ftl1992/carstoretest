package com.controller;

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
@RequestMapping("/remove")
public class RemoveController {
    @Autowired
    private Service service=new ServiceImpl();

        @RequestMapping("/removeSeries")
        public ModelAndView removeSeries(@RequestParam(value = "modelName",required = true) String modelName) throws Exception{
            List<TbModel> tbModelList = (List<TbModel>) service.selectByModelname(modelName);
            // ����ModelAndView
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.clear();
            modelAndView.addObject("tbModelList", tbModelList);
            modelAndView.setViewName("modelRemove");
            return modelAndView;
        }



    @RequestMapping("/removeToSeries")
    public ModelAndView removeToSeries(String modelName,String newSeriesCode) throws Exception{
        int b =service.updateModelSeriesCode(modelName,newSeriesCode);
        if (b!=0){
            List<TbModel> tbModelList = (List<TbModel>) service.searchAllModel();
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



    @RequestMapping("/removeBrand")
    public ModelAndView removeBrand(@RequestParam(value = "seriesName",required = true) String seriesName) throws Exception{
        List<TbSeries> tbSeriesList = (List<TbSeries>) service.selectBySeriesname(seriesName);
        // ����ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.clear();
        modelAndView.addObject("tbSeriesList", tbSeriesList);
        modelAndView.setViewName("seriesRemove");
        return modelAndView;
    }



    @RequestMapping("/removeToBrand")
    public ModelAndView removeToBrand(String seriesName,String newBrandCode) throws Exception{
        int b =service.updateSeriesBrandCode(seriesName,newBrandCode);
        if (b!=0){
            List<TbSeries> tbSeriesList = (List<TbSeries>) service.searchAllSeries();
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
    }
