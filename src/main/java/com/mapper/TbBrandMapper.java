package com.mapper;

import com.po.BrandUpdateVo;
import com.po.TbBrand;
import com.po.TbBrandExample;
import com.po.TbSeries;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBrandMapper {
    int countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandExample example);
    List<TbBrand> findByBrandname(String brand_name);
    List<TbBrand> findtByEnameBrand(String en_name);
    List<TbBrand> findAnameBrand(String alias_name);
    List<TbBrand> findPinyin(String pinyin);

    TbBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    List<TbBrand> searchAllBrand();

    int addBrand(TbBrand tbBrand);

    int updateBrandSubmit(TbBrand tbBrand);


    int deleteByBrandName(String brandName);
}