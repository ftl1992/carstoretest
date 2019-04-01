package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;
import com.service.Service;

import java.util.List;

@Controller
@RequestMapping("/select")
public class SearchController {
		private Service service;

		@RequestMapping("/selectBySeriesname")
		public String selectBySeriesname(Model model, String series_name) throws Exception{
			
			//调用service查询商品信息
			List<TbSeries> tbSeriesList = service.selectBySeriesname(series_name);
			if (tbSeriesList!=null && !tbSeriesList.isEmpty()) {
				model.addAttribute("tbSeriesList", tbSeriesList);
				return "seriesSelect";
			}
			else {
				String en_name=series_name;
				tbSeriesList.addAll(service.selectByEname(en_name)) ;
				if (tbSeriesList!=null && !tbSeriesList.isEmpty()) {
					model.addAttribute("tbSeriesList", tbSeriesList);
					return "seriesSelect";
				}
				else {
					String alias_name=series_name;
					tbSeriesList.addAll( service.selectAname(alias_name));
					model.addAttribute("tbSeriesList", tbSeriesList);
					return "seriesSelect";
				}
			}
		}
		
		

		@RequestMapping("/selectByModelname")
		public 	String selectByModelname(Model model,String model_name)throws Exception{
			
			//调用service查询商品信息
			List<TbModel> tbModelList = service.selectByModelname(model_name);
			if (tbModelList!=null && !tbModelList.isEmpty()) {

				model.addAttribute("tbModelList",tbModelList);

				return "modelSelect";
			}
			else {
				String short_name= model_name;
				tbModelList.addAll(service.selectByShortname(short_name)) ;
				model.addAttribute("tbModelList",tbModelList);
				return "modelSelect";
			}
		}
		@RequestMapping("/selectByBrand_code")
				public 	String selectByBrand_code(Model model,TbBrand tbBrand){
			List<TbSeries> tbSeriesList = null;
			try {
				tbSeriesList = service.selectByBrand_code(tbBrand.getBrandCode());
			} catch (Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("tbSeriesList",tbSeriesList);
			return "seriesSelect";
		}

	@RequestMapping("/selectBySeries_code")
	public 	String selectBySeries_code(Model model,TbSeries tbSeries){
		List<TbModel> tbModelList = null;
		try {
			tbModelList = service.selectBySeries_code(tbSeries.getSeriesCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("tbModelList",tbModelList);
		return "modelSelect";
	}




		@RequestMapping("/selectByBrandname")
		public String selectByBrandname(Model model,String brand_name) throws Exception{
			
			//调用service查询商品信息
			List<TbBrand>  tbBrandList = service.selectByBrandname(brand_name);
			if (tbBrandList!=null && !tbBrandList.isEmpty()) {
				model.addAttribute("tbBrandList", tbBrandList);

				return "brandSelect";
			}
			else {
				String en_name=brand_name;
				tbBrandList.addAll(service.selectByEnameBrand(en_name));
				if (tbBrandList!=null && !tbBrandList.isEmpty()) {
					model.addAttribute("tbBrandList", tbBrandList);
					return "brandSelect";
				}
				else {
					String alias_name=en_name;
					tbBrandList.addAll(service.selectAnameBrand(alias_name));
					if (tbBrandList!=null && !tbBrandList.isEmpty()) {
						model.addAttribute("tbBrandList", tbBrandList);
						return "brandSelect";
					}
					else {
						String pinyin=alias_name;
						tbBrandList.addAll(service.selectPinyin(pinyin));
						model.addAttribute("tbBrandList", tbBrandList);
						return "brandSelect";
					}
				}
				}
			}

		}


