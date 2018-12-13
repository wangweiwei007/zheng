package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ShopOrder implements Serializable {
    /**
     * ID或订单号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 运费
     *
     * @mbg.generated
     */
    private Float deliverFee;

    /**
     * 应付金额
     *
     * @mbg.generated
     */
    private Float totalPrice;

    /**
     * 订单金额
     *
     * @mbg.generated
     */
    private Float orderPrice;

    /**
     * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐
     *
     * @mbg.generated
     */
    private Boolean paymentWay;

    /**
     * 货到付款方式.1现金,2POS刷卡
     *
     * @mbg.generated
     */
    private Boolean paymentCash;

    /**
     * 送货时间
     *
     * @mbg.generated
     */
    private Boolean delivery;

    /**
     * 是否电话确认 1:是  0: 否
     *
     * @mbg.generated
     */
    private Boolean isConfirm;

    /**
     * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败
     *
     * @mbg.generated
     */
    private Boolean isPaiy;

    /**
     * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货
     *
     * @mbg.generated
     */
    private Boolean orderState;

    /**
     * 订单生成时间
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 附言
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Long buyerId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(Float deliverFee) {
        this.deliverFee = deliverFee;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Boolean getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Boolean paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Boolean getPaymentCash() {
        return paymentCash;
    }

    public void setPaymentCash(Boolean paymentCash) {
        this.paymentCash = paymentCash;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Boolean getIsPaiy() {
        return isPaiy;
    }

    public void setIsPaiy(Boolean isPaiy) {
        this.isPaiy = isPaiy;
    }

    public Boolean getOrderState() {
        return orderState;
    }

    public void setOrderState(Boolean orderState) {
        this.orderState = orderState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deliverFee=").append(deliverFee);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", paymentWay=").append(paymentWay);
        sb.append(", paymentCash=").append(paymentCash);
        sb.append(", delivery=").append(delivery);
        sb.append(", isConfirm=").append(isConfirm);
        sb.append(", isPaiy=").append(isPaiy);
        sb.append(", orderState=").append(orderState);
        sb.append(", createDate=").append(createDate);
        sb.append(", note=").append(note);
        sb.append(", buyerId=").append(buyerId);
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
        ShopOrder other = (ShopOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeliverFee() == null ? other.getDeliverFee() == null : this.getDeliverFee().equals(other.getDeliverFee()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getPaymentWay() == null ? other.getPaymentWay() == null : this.getPaymentWay().equals(other.getPaymentWay()))
            && (this.getPaymentCash() == null ? other.getPaymentCash() == null : this.getPaymentCash().equals(other.getPaymentCash()))
            && (this.getDelivery() == null ? other.getDelivery() == null : this.getDelivery().equals(other.getDelivery()))
            && (this.getIsConfirm() == null ? other.getIsConfirm() == null : this.getIsConfirm().equals(other.getIsConfirm()))
            && (this.getIsPaiy() == null ? other.getIsPaiy() == null : this.getIsPaiy().equals(other.getIsPaiy()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getBuyerId() == null ? other.getBuyerId() == null : this.getBuyerId().equals(other.getBuyerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeliverFee() == null) ? 0 : getDeliverFee().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getPaymentWay() == null) ? 0 : getPaymentWay().hashCode());
        result = prime * result + ((getPaymentCash() == null) ? 0 : getPaymentCash().hashCode());
        result = prime * result + ((getDelivery() == null) ? 0 : getDelivery().hashCode());
        result = prime * result + ((getIsConfirm() == null) ? 0 : getIsConfirm().hashCode());
        result = prime * result + ((getIsPaiy() == null) ? 0 : getIsPaiy().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getBuyerId() == null) ? 0 : getBuyerId().hashCode());
        return result;
    }
}