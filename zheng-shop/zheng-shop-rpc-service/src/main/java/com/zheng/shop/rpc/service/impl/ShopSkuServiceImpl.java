package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopSkuMapper;
import com.zheng.shop.dao.model.ShopSku;
import com.zheng.shop.dao.model.ShopSkuExample;
import com.zheng.shop.rpc.api.ShopSkuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopSkuService实现
* Created by shuzheng on 2018/12/14.
*/
@Service
@Transactional
@BaseService
public class ShopSkuServiceImpl extends BaseServiceImpl<ShopSkuMapper, ShopSku, ShopSkuExample> implements ShopSkuService {

    private static Logger _log = LoggerFactory.getLogger(ShopSkuServiceImpl.class);

    @Autowired
    ShopSkuMapper shopSkuMapper;

}