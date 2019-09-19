package com.pineapple.big.apigateway.dao;

import com.pineapple.big.apigateway.ApiGatewayApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiGatewayApplicationTests.class)
public class MapperTest {

    @Autowired
    private RouteMapper routeMapper;

    @Test
    public void test() {
        routeMapper.selectAll();
    }
}
