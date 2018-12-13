package com.zheng.shop.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.shop.dao.mapper.ShopDetailMapper;
import com.zheng.shop.dao.model.ShopDetail;
import com.zheng.shop.dao.model.ShopDetailExample;
import com.zheng.shop.rpc.api.ShopDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShopDetailService实现
* Created by shuzheng on 2018/12/14.
*/
@Service
@Transactional
@BaseService
public class ShopDetailServiceImpl extends BaseServiceImpl<ShopDetailMapper, ShopDetail, ShopDetailExample> implements ShopDetailService {

    private static Logger _log = LoggerFactory.getLogger(ShopDetailServiceImpl.class);

    @Autowired
    ShopDetailMapper shopDetailMapper;

}