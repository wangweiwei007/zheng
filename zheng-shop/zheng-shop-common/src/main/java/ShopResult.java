import com.zheng.common.base.BaseResult;

/**
 * shop系统常量枚举类
 * Created by shuzheng on 2017/2/18.
 */
public class ShopResult extends BaseResult {

    public ShopResult(ShopResultConstant shopResultConstant, Object data) {
        super(shopResultConstant.getCode(), shopResultConstant.getMessage(), data);
    }

}
