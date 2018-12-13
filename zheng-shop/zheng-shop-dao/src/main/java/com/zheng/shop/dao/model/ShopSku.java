package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ShopSku implements Serializable {
    /**
     * ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 商品ID
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     * 颜色ID
     *
     * @mbg.generated
     */
    private Long colorId;

    /**
     * 尺码
     *
     * @mbg.generated
     */
    private String size;

    /**
     * 市场价
     *
     * @mbg.generated
     */
    private Float marketPrice;

    /**
     * 售价
     *
     * @mbg.generated
     */
    private Float price;

    /**
     * 运费 默认10元
     *
     * @mbg.generated
     */
    private Float deliveFee;

    /**
     * 库存
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     * 购买限制
     *
     * @mbg.generated
     */
    private Integer upperLimit;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Float getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Float marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDeliveFee() {
        return deliveFee;
    }

    public void setDeliveFee(Float deliveFee) {
        this.deliveFee = deliveFee;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", colorId=").append(colorId);
        sb.append(", size=").append(size);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", price=").append(price);
        sb.append(", deliveFee=").append(deliveFee);
        sb.append(", stock=").append(stock);
        sb.append(", upperLimit=").append(upperLimit);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ShopSku other = (ShopSku) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDeliveFee() == null ? other.getDeliveFee() == null : this.getDeliveFee().equals(other.getDeliveFee()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getUpperLimit() == null ? other.getUpperLimit() == null : this.getUpperLimit().equals(other.getUpperLimit()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDeliveFee() == null) ? 0 : getDeliveFee().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getUpperLimit() == null) ? 0 : getUpperLimit().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}