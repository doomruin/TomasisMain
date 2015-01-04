package com.tomasis.infrastructure.mapper;

import com.tomasis.core.model.TestInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Dreamwalker on 2015/1/4.
 */
public class TestRowMapper implements RowMapper{
    public Object mapRow(ResultSet r, int i) throws SQLException {
        TestInfo testInfo = new TestInfo();
        testInfo.setId(r.getInt("testid"));
        testInfo.setName(r.getString("name"));
        return testInfo;
    }
}
