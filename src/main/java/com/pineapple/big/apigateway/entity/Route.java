package com.pineapple.big.apigateway.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Route implements Serializable {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 路由id
     */
    @Column(name = "route_id")
    private String routeId;

    /**
     * 路由地址
     */
    @Column(name = "forward_url")
    private String forwardUrl;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 路由版本
     */
    private Integer version;

    /**
     * 状态：0 禁用  1：启用
     */
    private Integer status;

    /**
     * 是否删除1：删除 0：未删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 操作id
     */
    @Column(name = "update_id")
    private String updateId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取路由id
     *
     * @return route_id - 路由id
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * 设置路由id
     *
     * @param routeId 路由id
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * 获取路由地址
     *
     * @return forward_url - 路由地址
     */
    public String getForwardUrl() {
        return forwardUrl;
    }

    /**
     * 设置路由地址
     *
     * @param forwardUrl 路由地址
     */
    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取路由版本
     *
     * @return version - 路由版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置路由版本
     *
     * @param version 路由版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取状态：0 禁用  1：启用
     *
     * @return status - 状态：0 禁用  1：启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：0 禁用  1：启用
     *
     * @param status 状态：0 禁用  1：启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否删除1：删除 0：未删除
     *
     * @return is_delete - 是否删除1：删除 0：未删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除1：删除 0：未删除
     *
     * @param isDelete 是否删除1：删除 0：未删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取操作id
     *
     * @return update_id - 操作id
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * 设置操作id
     *
     * @param updateId 操作id
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", routeId=").append(routeId);
        sb.append(", forwardUrl=").append(forwardUrl);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", version=").append(version);
        sb.append(", status=").append(status);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", updateId=").append(updateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}