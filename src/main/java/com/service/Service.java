package com.service;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;

import java.util.List;

public interface Service {
	public List<TbSeries> selectBySeriesname(String series_name) throws Exception;
	public List<TbSeries> selectByEname(String en_name) throws Exception;
	public List<TbSeries> selectAname(String alias_name) throws Exception;

	public 	List<TbModel> selectByModelname(String model_name)throws Exception;
	public List<TbModel> selectByShortname(String short_name)throws Exception;
	public List<TbModel> selectBySeries_code(String series_code)throws Exception;

	public List<TbBrand> findtByEnameBrand(String en_name) throws Exception;
	public List<TbBrand> findByBrandname(String brand_name) throws Exception;
	public List<TbBrand> findAnameBrand(String alias_name) throws Exception;
	public List<TbBrand> findPinyin(String pinyin) throws Exception;




	public List<TbBrand> selectByBrandname(String brand_name) throws Exception;
	public List<TbBrand> selectByEnameBrand(String en_name) throws Exception ;
    public List<TbSeries> selectByBrand_code(String brand_code) throws Exception ;
	public List<TbBrand> selectPinyin(String pinyin) throws Exception ;
	public List<TbBrand> selectAnameBrand(String alias_name) throws Exception ;
}
