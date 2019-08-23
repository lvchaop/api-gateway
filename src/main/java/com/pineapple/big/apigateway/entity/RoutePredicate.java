package com.pineapple.big.apigateway.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "route_predicate")
public class RoutePredicate implements Serializable {
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
     * 断言名称
     */
    @Column(name = "predicate_name")
    private String predicateName;

    /**
     * 断言参数 json格式
     */
    @Column(name = "predicate_args")
    private String predicateArgs;

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
     * 更新id
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
     * 获取断言名称
     *
     * @return predicate_name - 断言名称
     */
    public String getPredicateName() {
        return predicateName;
    }

    /**
     * 设置断言名称
     *
     * @param predicateName 断言名称
     */
    public void setPredicateName(String predicateName) {
        this.predicateName = predicateName;
    }

    /**
     * 获取断言参数 json格式
     *
     * @return predicate_args - 断言参数 json格式
     */
    public String getPredicateArgs() {
        return predicateArgs;
    }

    /**
     * 设置断言参数 json格式
     *
     * @param predicateArgs 断言参数 json格式
     */
    public void setPredicateArgs(String predicateArgs) {
        this.predicateArgs = predicateArgs;
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
     * 获取更新id
     *
     * @return update_id - 更新id
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * 设置更新id
     *
     * @param updateId 更新id
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
        sb.append(", predicateName=").append(predicateName);
        sb.append(", predicateArgs=").append(predicateArgs);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateId=").append(updateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}