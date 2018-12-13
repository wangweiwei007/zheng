package com.zheng.shop.dao.mapper;

import com.zheng.shop.dao.model.ShopDetail;
import com.zheng.shop.dao.model.ShopDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopDetailMapper {
    long countByExample(ShopDetailExample example);

    int deleteByExample(ShopDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopDetail record);

    int insertSelective(ShopDetail record);

    List<ShopDetail> selectByExample(ShopDetailExample example);

    ShopDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopDetail record, @Param("example") ShopDetailExample example);

    int updateByExample(@Param("record") ShopDetail record, @Param("example") ShopDetailExample example);

    int updateByPrimaryKeySelective(ShopDetail record);

    int updateByPrimaryKey(ShopDetail record);
}