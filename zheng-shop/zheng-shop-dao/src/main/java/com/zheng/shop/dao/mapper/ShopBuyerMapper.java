package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopBuyer;
import com.zheng.shop.dao.model.ShopBuyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopBuyerMapper {
    long countByExample(ShopBuyerExample example);

    int deleteByExample(ShopBuyerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopBuyer record);

    int insertSelective(ShopBuyer record);

    List<ShopBuyer> selectByExample(ShopBuyerExample example);

    ShopBuyer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopBuyer record, @Param("example") ShopBuyerExample example);

    int updateByExample(@Param("record") ShopBuyer record, @Param("example") ShopBuyerExample example);

    int updateByPrimaryKeySelective(ShopBuyer record);

    int updateByPrimaryKey(ShopBuyer record);
}