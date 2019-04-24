package com.controller;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;
import com.service.Service;
import com.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/add")
public class AddController {
    @Autowired
    private Service service=new ServiceImpl();
    @RequestMapping("/addBr")
    public ModelAndView addBr( ) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.clear();

        modelAndView.setViewName("addB");

        return modelAndView;
    }

    @RequestMapping("/addSe")
    public ModelAndView addSe( ) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.clear();

        modelAndView.setViewName("addS");

        return modelAndView;
    }
    @RequestMapping("/addMo")
    public ModelAndView addMo( ) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.clear();

        modelAndView.setViewName("addM");

        return modelAndView;
    }
    @RequestMapping("/addBrand")
    public ModelAndView addBrand(TbBrand tbBrand ) throws Exception{
        System.out.print(tbBrand.getBrandName());

        //����service��ѯ��Ʒ��Ϣ
       int a = service.addBrand(tbBrand);
       if (a!=0) {
           List<TbBrand> tbBrandList = (List<TbBrand>) service.searchAllBrand();
           // ����ModelAndView
           ModelAndView modelAndView = new ModelAndView();
           // �൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
           modelAndView.clear();
           modelAndView.addObject("tbBrandList", tbBrandList);

           // ָ����ͼ
           // �±ߵ�·�����������ͼ������������jsp·����ǰ׺��jsp·���ĺ�׺���޸�Ϊ
           // modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
           // �ϱߵ�·�����ÿ��Բ��ڳ�����ָ��jsp·����ǰ׺��jsp·���ĺ�׺
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


    @RequestMapping("/addModel")
    public ModelAndView addModel(TbModel tbModel ) throws Exception{
        System.out.print(tbModel.getModelName());

        //����service��ѯ��Ʒ��Ϣ
        int a = service.addModel(tbModel);
        if (a!=0) {
            List<TbModel> tbModelList = (List<TbModel>) service.searchAllModel();
            // ����ModelAndView
            ModelAndView modelAndView = new ModelAndView();
            // �൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
            modelAndView.clear();
            modelAndView.addObject("tbModelList", tbModelList);

            // ָ����ͼ
            // �±ߵ�·�����������ͼ������������jsp·����ǰ׺��jsp·���ĺ�׺���޸�Ϊ
            // modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
            // �ϱߵ�·�����ÿ��Բ��ڳ�����ָ��jsp·����ǰ׺��jsp·���ĺ�׺
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




    @RequestMapping("/addSeries")
    public ModelAndView addSeries(TbSeries tbSeries ) throws Exception{
        System.out.print(tbSeries.getSeriesName());

        //����service��ѯ��Ʒ��Ϣ
        int a = service.addSeries(tbSeries);
        if (a!=0) {
            List<TbSeries> tbSeriesList = (List<TbSeries>) service.searchAllSeries();
            // ����ModelAndView
            ModelAndView modelAndView = new ModelAndView();
            // �൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
            modelAndView.clear();
            modelAndView.addObject("tbSeriesList", tbSeriesList);

            // ָ����ͼ
            // �±ߵ�·�����������ͼ������������jsp·����ǰ׺��jsp·���ĺ�׺���޸�Ϊ
            // modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
            // �ϱߵ�·�����ÿ��Բ��ڳ�����ָ��jsp·����ǰ׺��jsp·���ĺ�׺
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
