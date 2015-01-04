package com.tomasis.infrastructure.dao;

import com.tomasis.core.model.TestInfo;
import com.tomasis.infrastructure.mapper.TestRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dreamwalker on 2014/12/30.
 */
@Repository
@Transactional
public class TestDaoImpl extends JdbcDaoSupport implements TestDao{
    private static String FIND_BY_ID = "select * from test where testid=?";
    public TestInfo findById(int id) {
        return (TestInfo)getJdbcTemplate().queryForObject(FIND_BY_ID,new TestRowMapper(),id);
    }
}
