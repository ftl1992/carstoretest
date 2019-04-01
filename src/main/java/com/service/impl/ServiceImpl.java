package com.service.impl;

import com.po.*;
import com.service.Service;
import com.mapper.*;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	private TbBrandExample tbBrandExample;
	private TbModelExample tbModelExample;
	private TbSeriesExample tbSeriesExample;
	private TbSeriesMapper tbSeriesMapper;
	private TbBrandMapper tbBrandMapper;
	private TbModelMapper tbModelMapper;

	public List<TbSeries> selectBySeriesname(String series_name) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andSeriesNameLike(series_name);
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}

	public List<TbSeries> selectByEname(String en_name) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andEnNameLike(en_name);
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}

	public List<TbSeries> selectAname(String alias_name) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andAliasNameLike(alias_name);
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}

	public List<TbModel> selectByModelname(String model_name) throws Exception {
		TbModelExample.Criteria criteria=tbModelExample.createCriteria();
		criteria.andModelNameLike(model_name);
		return tbModelMapper.selectByExample(tbModelExample);
	}


	public List<TbModel> selectByShortname(String short_name) throws Exception {
		TbModelExample.Criteria criteria=tbModelExample.createCriteria();
		criteria.andShortNameLike(short_name);
		return tbModelMapper.selectByExample(tbModelExample);

	}


	public List<TbModel> selectBySeries_code(String series_code)throws Exception{
		TbModelExample.Criteria criteria=tbModelExample.createCriteria();
		criteria.andSeriesCodeEqualTo(series_code);
		return tbModelMapper.selectByExample(tbModelExample);
	}

	public List<TbBrand> selectByBrandname(String brand_name) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andBrandNameLike(brand_name);
		return tbBrandMapper.selectByExample(tbBrandExample);
	}

	public List<TbBrand> selectByEnameBrand(String en_name) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andEnNameLike(en_name);
		return tbBrandMapper.selectByExample(tbBrandExample);
	}

	public List<TbSeries> selectByBrand_code(String brand_code) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andBrandCodeEqualTo(brand_code);
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}

	public List<TbBrand> selectPinyin(String pinyin) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andPinyinLike(pinyin);
		return tbBrandMapper.selectByExample(tbBrandExample);
	}

	public List<TbBrand> selectAnameBrand(String alias_name) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andAliasNameLike(alias_name);
		return tbBrandMapper.selectByExample(tbBrandExample);
	}

}
