package com.pineapple.big.apigateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiGatewayApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Bean(name="dataSourceUtils") // 要和模拟的数据源名称相对应
    DataSource dataSourceUtils() throws SQLException {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:/script/H2_TYPE.sql")
                .addScript("classpath:/script/INIT_TABLE.sql")
                .addScript("classpath:/script/H2_FUNCTION.sql")
                .addScript("classpath:/script/INIT_DATA.sql")
                .build();
    }

}
