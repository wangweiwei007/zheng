package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopSkuMapper;
import com.zheng.shop.dao.model.ShopSku;
import com.zheng.shop.dao.model.ShopSkuExample;

/**
* 降级实现ShopSkuService接口
* Created by shuzheng on 2018/12/14.
*/
public class ShopSkuServiceMock extends BaseServiceMock<ShopSkuMapper, ShopSku, ShopSkuExample> implements ShopSkuService {

}
