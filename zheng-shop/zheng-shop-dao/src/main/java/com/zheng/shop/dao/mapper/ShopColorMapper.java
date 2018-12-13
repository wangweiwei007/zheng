package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopColor;
import com.zheng.shop.dao.model.ShopColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopColorMapper {
    long countByExample(ShopColorExample example);

    int deleteByExample(ShopColorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopColor record);

    int insertSelective(ShopColor record);

    List<ShopColor> selectByExample(ShopColorExample example);

    ShopColor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopColor record, @Param("example") ShopColorExample example);

    int updateByExample(@Param("record") ShopColor record, @Param("example") ShopColorExample example);

    int updateByPrimaryKeySelective(ShopColor record);

    int updateByPrimaryKey(ShopColor record);
}