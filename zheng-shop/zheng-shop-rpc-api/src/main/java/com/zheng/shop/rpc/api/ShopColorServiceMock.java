package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopColorMapper;
import com.zheng.shop.dao.model.ShopColor;
import com.zheng.shop.dao.model.ShopColorExample;

/**
* 降级实现ShopColorService接口
* Created by shuzheng on 2018/12/14.
*/
public class ShopColorServiceMock extends BaseServiceMock<ShopColorMapper, ShopColor, ShopColorExample> implements ShopColorService {

}
