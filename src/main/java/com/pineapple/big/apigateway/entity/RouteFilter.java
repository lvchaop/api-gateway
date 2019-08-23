package com.pineapple.big.apigateway.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "route_filter")
public class RouteFilter implements Serializable {
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
     * 过滤器名称
     */
    @Column(name = "filter_name")
    private String filterName;

    /**
     * json格式 存放过滤器参数
     */
    @Column(name = "filter_args")
    private String filterArgs;

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
     * 更新id 关联log表中的主键id
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
     * 获取过滤器名称
     *
     * @return filter_name - 过滤器名称
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * 设置过滤器名称
     *
     * @param filterName 过滤器名称
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * 获取json格式 存放过滤器参数
     *
     * @return filter_args - json格式 存放过滤器参数
     */
    public String getFilterArgs() {
        return filterArgs;
    }

    /**
     * 设置json格式 存放过滤器参数
     *
     * @param filterArgs json格式 存放过滤器参数
     */
    public void setFilterArgs(String filterArgs) {
        this.filterArgs = filterArgs;
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
     * 获取更新id 关联log表中的主键id
     *
     * @return update_id - 更新id 关联log表中的主键id
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * 设置更新id 关联log表中的主键id
     *
     * @param updateId 更新id 关联log表中的主键id
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
        sb.append(", filterName=").append(filterName);
        sb.append(", filterArgs=").append(filterArgs);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateId=").append(updateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}