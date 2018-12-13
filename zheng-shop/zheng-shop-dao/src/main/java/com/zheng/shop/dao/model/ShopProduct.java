package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ShopProduct implements Serializable {
    /**
     * ID或商品编号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 品牌ID
     *
     * @mbg.generated
     */
    private Long brandId;

    /**
     * 商品名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 重量 单位:克
     *
     * @mbg.generated
     */
    private Float weight;

    /**
     * 是否新品:0:旧品,1:新品
     *
     * @mbg.generated
     */
    private Boolean isNew;

    /**
     * 是否热销:0,否 1:是
     *
     * @mbg.generated
     */
    private Boolean isHot;

    /**
     * 推荐 1推荐 0 不推荐
     *
     * @mbg.generated
     */
    private Boolean isCommend;

    /**
     * 上下架:0否 1是
     *
     * @mbg.generated
     */
    private Boolean isShow;

    /**
     * 是否删除:0删除,1,没删除
     *
     * @mbg.generated
     */
    private Boolean isDel;

    /**
     * 颜色集
     *
     * @mbg.generated
     */
    private String colors;

    /**
     * 尺寸集
     *
     * @mbg.generated
     */
    private String sizes;

    /**
     * 添加时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 商品图片集
     *
     * @mbg.generated
     */
    private String imgUrl;

    /**
     * 商品描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 包装清单
     *
     * @mbg.generated
     */
    private String packageList;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsCommend() {
        return isCommend;
    }

    public void setIsCommend(Boolean isCommend) {
        this.isCommend = isCommend;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", name=").append(name);
        sb.append(", weight=").append(weight);
        sb.append(", isNew=").append(isNew);
        sb.append(", isHot=").append(isHot);
        sb.append(", isCommend=").append(isCommend);
        sb.append(", isShow=").append(isShow);
        sb.append(", isDel=").append(isDel);
        sb.append(", colors=").append(colors);
        sb.append(", sizes=").append(sizes);
        sb.append(", createTime=").append(createTime);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", description=").append(description);
        sb.append(", packageList=").append(packageList);
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
        ShopProduct other = (ShopProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getIsNew() == null ? other.getIsNew() == null : this.getIsNew().equals(other.getIsNew()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getIsCommend() == null ? other.getIsCommend() == null : this.getIsCommend().equals(other.getIsCommend()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getColors() == null ? other.getColors() == null : this.getColors().equals(other.getColors()))
            && (this.getSizes() == null ? other.getSizes() == null : this.getSizes().equals(other.getSizes()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPackageList() == null ? other.getPackageList() == null : this.getPackageList().equals(other.getPackageList()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getIsNew() == null) ? 0 : getIsNew().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getIsCommend() == null) ? 0 : getIsCommend().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getColors() == null) ? 0 : getColors().hashCode());
        result = prime * result + ((getSizes() == null) ? 0 : getSizes().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPackageList() == null) ? 0 : getPackageList().hashCode());
        return result;
    }
}