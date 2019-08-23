package com.pineapple.big.apigateway.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Filter implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 过滤器名称
     */
    @Column(name = "filter_name")
    private String filterName;

    /**
     * 过滤器描述
     */
    @Column(name = "filter_desc")
    private String filterDesc;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取过滤器描述
     *
     * @return filter_desc - 过滤器描述
     */
    public String getFilterDesc() {
        return filterDesc;
    }

    /**
     * 设置过滤器描述
     *
     * @param filterDesc 过滤器描述
     */
    public void setFilterDesc(String filterDesc) {
        this.filterDesc = filterDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", filterName=").append(filterName);
        sb.append(", filterDesc=").append(filterDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}