package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopBuyerMapper;
import com.zheng.shop.dao.model.ShopBuyer;
import com.zheng.shop.dao.model.ShopBuyerExample;
import com.zheng.shop.rpc.api.ShopBuyerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopBuyerService实现
* Created by shuzheng on 2018/12/14.
*/
@Service
@Transactional
@BaseService
public class ShopBuyerServiceImpl extends BaseServiceImpl<ShopBuyerMapper, ShopBuyer, ShopBuyerExample> implements ShopBuyerService {

    private static Logger _log = LoggerFactory.getLogger(ShopBuyerServiceImpl.class);

    @Autowired
    ShopBuyerMapper shopBuyerMapper;

}