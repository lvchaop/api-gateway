package com.pineapple.big.apigateway.dao;

import com.pineapple.big.apigateway.entity.Route;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface RouteMapper extends Mapper<Route>, MySqlMapper<Route> {
}