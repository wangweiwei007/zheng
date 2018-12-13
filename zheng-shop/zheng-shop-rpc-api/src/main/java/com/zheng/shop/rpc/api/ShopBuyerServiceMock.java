package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopBuyerMapper;
import com.zheng.shop.dao.model.ShopBuyer;
import com.zheng.shop.dao.model.ShopBuyerExample;

/**
* 降级实现ShopBuyerService接口
* Created by shuzheng on 2018/12/14.
*/
public class ShopBuyerServiceMock extends BaseServiceMock<ShopBuyerMapper, ShopBuyer, ShopBuyerExample> implements ShopBuyerService {

}
