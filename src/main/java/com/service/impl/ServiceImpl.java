package com.service.impl;

import com.po.*;
import com.service.Service;
import com.mapper.*;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public class ServiceImpl implements Service {
	private TbBrandExample tbBrandExample =new TbBrandExample();
	private TbModelExample tbModelExample =new TbModelExample();
	private TbSeriesExample tbSeriesExample =new TbSeriesExample();
    @Autowired
	private TbSeriesMapper tbSeriesMapper;
    @Autowired
	private TbBrandMapper tbBrandMapper;
    @Autowired
	private TbModelMapper tbModelMapper;


	@Override
	public List<TbBrand> findByBrandname( String brand_name) throws Exception {
		return tbBrandMapper.findByBrandname(brand_name);
	}

	@Override
	public List<TbBrand> findAnameBrand(String alias_name) throws Exception {
		return tbBrandMapper.findAnameBrand(alias_name);
	}

	@Override
	public List<TbBrand> findPinyin(String pinyin) throws Exception {
		return tbBrandMapper.findPinyin(pinyin);
	}

	@Override
	public List<TbSeries> selectBySeriesname( String series_name) throws Exception {
        TbSeriesExample.Criteria criteria = (TbSeriesExample.Criteria) tbSeriesExample.createCriteria();

            criteria.andSeriesNameLike("%"+series_name+"%");
            return tbSeriesMapper.selectByExample(tbSeriesExample);

	}
    @Override
	public List<TbSeries> selectByEname(String en_name) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andEnNameLike("%"+en_name+"%");
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}
    @Override
	public List<TbSeries> selectAname(String alias_name) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andAliasNameLike(alias_name);
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}
    @Override
	public List<TbModel> selectByModelname(String model_name) throws Exception {
		TbModelExample.Criteria criteria=tbModelExample.createCriteria();
		criteria.andModelNameLike("%"+model_name+"%");
		return tbModelMapper.selectByExample(tbModelExample);
	}

    @Override
	public List<TbModel> selectByShortname(String short_name) throws Exception {
		TbModelExample.Criteria criteria=tbModelExample.createCriteria();
		criteria.andShortNameLike("%"+short_name+"%");
		return tbModelMapper.selectByExample(tbModelExample);

	}
    @Override
	public List<TbModel> selectBySeries_code(String series_code)throws Exception{
		TbModelExample.Criteria criteria=tbModelExample.createCriteria();
		criteria.andSeriesCodeEqualTo(series_code);
		return tbModelMapper.selectByExample(tbModelExample);
	}

	@Override
	public List<TbBrand> findtByEnameBrand(String en_name) throws Exception {
		return tbBrandMapper.findtByEnameBrand(en_name);
	}

	@Override
	public List<TbBrand> selectByBrandname(String brand_name) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andBrandNameLike("%"+brand_name+"%");
		return tbBrandMapper.selectByExample(tbBrandExample);
	}
    @Override
	public List<TbBrand> selectByEnameBrand(String en_name) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andEnNameLike("%"+en_name+"%");
		return tbBrandMapper.selectByExample(tbBrandExample);
	}
    @Override
	public List<TbSeries> selectByBrand_code(String brand_code) throws Exception {
		TbSeriesExample.Criteria criteria=tbSeriesExample.createCriteria();
		criteria.andBrandCodeEqualTo(brand_code);
		return tbSeriesMapper.selectByExample(tbSeriesExample);
	}
    @Override
	public List<TbBrand> selectPinyin(String pinyin) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andPinyinLike("%"+pinyin+"%");
		return tbBrandMapper.selectByExample(tbBrandExample);
	}
    @Override
	public List<TbBrand> selectAnameBrand(String alias_name) throws Exception {
		TbBrandExample.Criteria criteria=tbBrandExample.createCriteria();
		criteria.andAliasNameLike("%"+alias_name+"%");
		return tbBrandMapper.selectByExample(tbBrandExample);
	}

	@Override
	public int addBrand(TbBrand tbBrand) {
		return  tbBrandMapper.addBrand(tbBrand);


	}

	@Override
	public List<TbBrand> searchAllBrand() {
		return tbBrandMapper.searchAllBrand();
	}



	@Override
	public int addSeries(TbSeries tbSeries) {
		return  tbSeriesMapper.addSeries(tbSeries);


	}

	@Override
	public List<TbSeries> searchAllSeries() {
		return tbSeriesMapper.searchAllSeries();
	}


	@Override
	public int addModel(TbModel tbModel) {
		return tbModelMapper.addModel(tbModel);
	}

	@Override
	public List<TbModel> searchAllModel() {
		return tbModelMapper.searchAllModel();
	}

	@Override
	public int updateBrandSubmit(TbBrand tbBrand) {
		return tbBrandMapper.updateBrandSubmit(tbBrand);
	}
	@Override
	public int updateSeriesSubmit(TbSeries tbSeries) {
		return tbSeriesMapper.updateSeriesSubmit(tbSeries);
	}
	@Override
	public int updateModelSubmit(TbModel tbModel) {
		return tbModelMapper.updateModelSubmit(tbModel);
	}

	@Override
	public int deleteByModelName(String modelName) {
		return tbModelMapper.deleteByModelName(modelName);
	}

	@Override
	public int deleteByBrandName(String brandName) {
		return tbBrandMapper.deleteByBrandName(brandName);
	}

	@Override
	public int deleteBySeriesName(String seriesName) {
		return tbSeriesMapper.deleteBySeriesName(seriesName);
	}

    @Override
    public int updateModelSeriesCode(@Param("modelName") String modelName,@Param("newSeriesCode") String newSeriesCode) {
        return tbModelMapper.updateModelSeriesCode(modelName,newSeriesCode);
    }


}
