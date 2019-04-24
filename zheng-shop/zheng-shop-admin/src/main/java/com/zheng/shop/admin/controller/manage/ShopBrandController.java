package com.zheng.shop.admin.controller.manage;

import com.zheng.common.util.StringUtil;
import com.zheng.shop.dao.model.ShopBrand;
import com.zheng.shop.dao.model.ShopBrandExample;
import com.zheng.shop.rpc.api.ShopBrandService;
import com.zheng.upms.common.constant.UpmsResult;
import com.zheng.upms.common.constant.UpmsResultConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: weiwei wang
 * @date: 2018/12/21
 * @description: 品牌管理
 */

@Controller
@Api(value = "品牌管理", description = "品牌管理")
@RequestMapping("/manage/brand")
public class ShopBrandController {

    private static Logger _log = LoggerFactory.getLogger(ShopBrandController.class);

    @Autowired
    private ShopBrandService shopBrandService;

    @ApiOperation(value = "品牌首页")
    @RequiresPermissions("shop:brand:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/brand/index.jsp";
    }

    @ApiOperation(value = "品牌列表")
    @RequiresPermissions("shop:brand:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "name") String search,
            @RequestParam(required = false, defaultValue = "", value = "isDisplay") String isDisplay,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ShopBrandExample shopBrandExample = new ShopBrandExample();
        if (StringUtils.isNotBlank(sort) && StringUtils.isNotBlank(order)) {
            shopBrandExample.setOrderByClause(StringUtil.humpToLine(sort) + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            shopBrandExample.or()
                    .andDescriptionLike("%" + search + "%");
        }
        List<ShopBrand> rows = shopBrandService.selectByExampleForOffsetPage(shopBrandExample, offset, limit);
        long total = shopBrandService.countByExample(shopBrandExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "删除品牌")
    @RequiresPermissions("shop:brand:delete")
    @RequestMapping(value = "/delete/{ids}", method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = shopBrandService.deleteByPrimaryKeys(ids);
        return new UpmsResult(UpmsResultConstant.SUCCESS, count);
    }

}
