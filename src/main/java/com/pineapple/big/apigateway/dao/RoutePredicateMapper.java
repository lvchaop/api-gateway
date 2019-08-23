package com.pineapple.big.apigateway.dao;

import com.pineapple.big.apigateway.entity.RoutePredicate;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface RoutePredicateMapper extends Mapper<RoutePredicate>, MySqlMapper<RoutePredicate> {
}