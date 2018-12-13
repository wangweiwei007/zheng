package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopOrderMapper;
import com.zheng.shop.dao.model.ShopOrder;
import com.zheng.shop.dao.model.ShopOrderExample;
import com.zheng.shop.rpc.api.ShopOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopOrderService实现
* Created by shuzheng on 2018/12/14.
*/
@Service
@Transactional
@BaseService
public class ShopOrderServiceImpl extends BaseServiceImpl<ShopOrderMapper, ShopOrder, ShopOrderExample> implements ShopOrderService {

    private static Logger _log = LoggerFactory.getLogger(ShopOrderServiceImpl.class);

    @Autowired
    ShopOrderMapper shopOrderMapper;

}