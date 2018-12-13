package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopSku;
import com.zheng.shop.dao.model.ShopSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopSkuMapper {
    long countByExample(ShopSkuExample example);

    int deleteByExample(ShopSkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopSku record);

    int insertSelective(ShopSku record);

    List<ShopSku> selectByExample(ShopSkuExample example);

    ShopSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopSku record, @Param("example") ShopSkuExample example);

    int updateByExample(@Param("record") ShopSku record, @Param("example") ShopSkuExample example);

    int updateByPrimaryKeySelective(ShopSku record);

    int updateByPrimaryKey(ShopSku record);
}