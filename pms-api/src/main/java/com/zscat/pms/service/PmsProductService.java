package com.zscat.pms.service;

import com.zscat.pms.dto.*;
import com.zscat.pms.model.PmsProduct;

import java.util.List;

/**
 * 商品管理Service
 * Created by zscat on 2018/4/26.
 */
public interface PmsProductService {
    /**
     * 创建商品
     */
    int create(PmsProductParam productParam);

    /**
     * 根据商品编号获取更新信息
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * 更新商品
     */

    int update(Long id, PmsProductParam productParam);

    /**
     * 分页查询商品
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam);

    /**
     * 批量修改审核状态
     *
     * @param ids          产品id
     * @param verifyStatus 审核状态
     * @param detail       审核详情
     */

    int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail);

    /**
     * 批量修改商品上架状态
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    /**
     * 批量修改商品推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 批量修改新品状态
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);

    /**
     * 批量删除商品
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * 根据商品名称或者货号模糊查询
     */
    List<PmsProduct> list(String keyword);

    PmsProduct selectByPrimaryKey(Long id);

    List<PromotionProduct> getPromotionProductList(List<OmsCartItem> cartItemList);

    CartProduct getCartProduct(Long productId);
}
