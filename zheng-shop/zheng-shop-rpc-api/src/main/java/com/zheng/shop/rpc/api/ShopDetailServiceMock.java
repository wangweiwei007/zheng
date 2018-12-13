package com.zheng.shop.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.shop.dao.mapper.ShopDetailMapper;
import com.zheng.shop.dao.model.ShopDetail;
import com.zheng.shop.dao.model.ShopDetailExample;

/**
* 降级实现ShopDetailService接口
* Created by shuzheng on 2018/12/14.
*/
public class ShopDetailServiceMock extends BaseServiceMock<ShopDetailMapper, ShopDetail, ShopDetailExample> implements ShopDetailService {

}
