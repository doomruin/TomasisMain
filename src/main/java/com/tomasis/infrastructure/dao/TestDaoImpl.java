package com.tomasis.infrastructure.dao;

import com.tomasis.core.model.TestInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by Dreamwalker on 2014/12/30.
 */
public class TestDaoImpl extends SqlMapClientDaoSupport implements TestDao{
    public TestInfo findById(int id) {
        return (TestInfo)getSqlMapClientTemplate().queryForObject("findById");
    }
}
