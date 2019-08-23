package com.pineapple.big.apigateway.dao;

import com.pineapple.big.apigateway.entity.Filter;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface FilterMapper extends Mapper<Filter>, MySqlMapper<Filter> {
}