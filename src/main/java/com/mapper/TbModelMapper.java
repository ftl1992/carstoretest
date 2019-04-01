package com.mapper;

import com.po.TbModel;
import com.po.TbModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbModelMapper {
    int countByExample(TbModelExample example);

    int deleteByExample(TbModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbModel record);

    int insertSelective(TbModel record);

    List<TbModel> selectByExample(TbModelExample example);

    TbModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbModel record, @Param("example") TbModelExample example);

    int updateByExample(@Param("record") TbModel record, @Param("example") TbModelExample example);

    int updateByPrimaryKeySelective(TbModel record);

    int updateByPrimaryKey(TbModel record);
}