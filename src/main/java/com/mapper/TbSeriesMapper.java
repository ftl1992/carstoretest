package com.mapper;

import com.po.TbBrand;
import com.po.TbSeries;
import com.po.TbSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeriesMapper {
    int countByExample(TbSeriesExample example);

    int deleteByExample(TbSeriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSeries record);

    int insertSelective(TbSeries record);

    List<TbSeries> selectByExample(TbSeriesExample example);

    TbSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSeries record, @Param("example") TbSeriesExample example);

    int updateByExample(@Param("record") TbSeries record, @Param("example") TbSeriesExample example);

    int updateByPrimaryKeySelective(TbSeries record);

    int updateByPrimaryKey(TbSeries record);

    int addSeries(TbSeries tbSeries);

    List<TbSeries> searchAllSeries();
    int updateSeriesSubmit(TbSeries tbSeries);

    int deleteBySeriesName(String seriesName);

    int updateSeriesBrandCode(@Param("seriesName")String seriesName,@Param("newBrandCode") String newBrandCode);
}