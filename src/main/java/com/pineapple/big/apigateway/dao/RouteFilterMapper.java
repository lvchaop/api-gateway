package com.pineapple.big.apigateway.dao;

import com.pineapple.big.apigateway.entity.RouteFilter;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface RouteFilterMapper extends Mapper<RouteFilter>, MySqlMapper<RouteFilter> {
}