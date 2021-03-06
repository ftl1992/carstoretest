package com.controller;


import com.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;
import com.service.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/select")
public class SearchController {
		@Autowired
		private Service service=new ServiceImpl();



	@RequestMapping("/searchAllBrand")
	public ModelAndView searchAllBrand() throws Exception{

		List<TbBrand> tbBrandList = (List<TbBrand>) service.searchAllBrand();
		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.clear();
		modelAndView.addObject("tbBrandList", tbBrandList);
		modelAndView.setViewName("brandSelect");
		return modelAndView;
	}


		@RequestMapping("/selectBySeriesname")
		public ModelAndView selectBySeriesname( String series_name ) throws Exception{
			System.out.print(series_name);

			//����service��ѯ��Ʒ��Ϣ
			List<TbSeries> tbSeriesList = (List<TbSeries>)service.selectBySeriesname(series_name);
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

	@RequestMapping("/selectByBrandname")
	public ModelAndView selectByBrandname(Model model,String brand_name) throws Exception{
		ModelAndView modelAndView = new ModelAndView();


		System.out.print(brand_name);
		//����service��ѯ��Ʒ��Ϣ
		List<TbBrand>  tbBrandList = (List<TbBrand>)service.findByBrandname(brand_name);

		if (tbBrandList!=null&&tbBrandList.size()!=0) {
			modelAndView.clear();
			modelAndView.addObject("tbBrandList", tbBrandList);
			modelAndView.setViewName("brandSelect");
			return modelAndView;
		}
		else {
			assert tbBrandList != null;
			tbBrandList.addAll(service.findtByEnameBrand(brand_name));


			if ( tbBrandList.size()!=0) {
                modelAndView.clear();
				model.addAttribute("tbBrandList", tbBrandList);
                modelAndView.setViewName("brandSelect");
                return modelAndView;
			}
			else {
				tbBrandList.addAll(service.findAnameBrand(brand_name));

				if ( tbBrandList.size()!=0) {
                    modelAndView.clear();
					model.addAttribute("tbBrandList", tbBrandList);
                    modelAndView.setViewName("brandSelect");
                    return modelAndView;
				}
				else {
                    System.out.print(brand_name);
					tbBrandList.addAll(service.findPinyin(brand_name));

                    modelAndView.clear();
					model.addAttribute("tbBrandList", tbBrandList);
                    modelAndView.setViewName("brandSelect");
                    return modelAndView;
				}
			}
		}


	}

		@RequestMapping("/selectByModelname")
		public 	String selectByModelname(Model model,String model_name)throws Exception{
			
			//����service��ѯ��Ʒ��Ϣ
			List<TbModel> tbModelList = service.selectByModelname(model_name);
			if (tbModelList!=null && !tbModelList.isEmpty()) {

				model.addAttribute("tbModelList",tbModelList);

				return "modelSelect";
			}
			else {
                assert tbModelList != null;
                tbModelList.addAll(service.selectByShortname(model_name)) ;
				model.addAttribute("tbModelList",tbModelList);
				return "modelSelect";
			}
		}
		@RequestMapping("/selectByBrand_code")
				public 	String selectByBrand_code(Model model,@RequestParam(value = "brandCode",required = true) String brand_code){
			System.out.print(brand_code);
			List<TbSeries> tbSeriesList = null;
			try {
				tbSeriesList = service.selectByBrand_code(brand_code);
			} catch (Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("tbSeriesList",tbSeriesList);
			return "seriesSelect";
		}

	@RequestMapping("/selectBySeries_code")
	public 	String selectBySeries_code(Model model,@RequestParam(value = "seriesCode",required = true) String series_code){
		System.out.print(series_code);
		List<TbModel> tbModelList = null;
		try {
			tbModelList = service.selectBySeries_code(series_code);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("tbModelList",tbModelList);
		return "modelSelect";
		}
	}