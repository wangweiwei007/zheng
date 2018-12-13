package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopOrderMapper;
import com.zheng.shop.dao.model.ShopOrder;
import com.zheng.shop.dao.model.ShopOrderExample;

/**
* 降级实现ShopOrderService接口
* Created by shuzheng on 2018/12/14.
*/
public class ShopOrderServiceMock extends BaseServiceMock<ShopOrderMapper, ShopOrder, ShopOrderExample> implements ShopOrderService {

}
