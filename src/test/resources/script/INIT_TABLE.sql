CREATE TABLE `filter` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `filter_name` varchar(255) NOT NULL COMMENT '过滤器名称',
  `filter_desc` varchar(255) NOT NULL COMMENT '过滤器描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `route` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `route_id` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '路由id',
  `forward_url` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '路由地址',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `version` int(10) NOT NULL DEFAULT '0' COMMENT '路由版本',
  `status` int(2) NOT NULL DEFAULT '0' COMMENT '状态：0 禁用  1：启用',
  `is_delete` int(2) NOT NULL DEFAULT '0' COMMENT '是否删除1：删除 0：未删除',
  `update_id` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '操作id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `route_filter` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `route_id` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '路由id',
  `filter_name` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '过滤器名称',
  `filter_args` varchar(255) CHARACTER SET latin1 DEFAULT NULL COMMENT 'json格式 存放过滤器参数',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `update_id` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '更新id 关联log表中的主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `route_predicate` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `route_id` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '路由id',
  `predicate_name` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '断言名称',
  `predicate_args` varchar(255) CHARACTER SET latin1 DEFAULT NULL COMMENT '断言参数 json格式',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `update_id` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '更新id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;