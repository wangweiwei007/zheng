package com.zheng.shop.dao.model;

import java.io.Serializable;

public class ShopBrand implements Serializable {
    /**
     * ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 图片Url
     *
     * @mbg.generated
     */
    private String imgUrl;

    /**
     * 品牌网址
     *
     * @mbg.generated
     */
    private String webSite;

    /**
     * 排序:最大最排前
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 是否可见 1:可见 0:不可见
     *
     * @mbg.generated
     */
    private Boolean isDisplay;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", webSite=").append(webSite);
        sb.append(", sort=").append(sort);
        sb.append(", isDisplay=").append(isDisplay);
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
        ShopBrand other = (ShopBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getWebSite() == null ? other.getWebSite() == null : this.getWebSite().equals(other.getWebSite()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIsDisplay() == null ? other.getIsDisplay() == null : this.getIsDisplay().equals(other.getIsDisplay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getWebSite() == null) ? 0 : getWebSite().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIsDisplay() == null) ? 0 : getIsDisplay().hashCode());
        return result;
    }
}