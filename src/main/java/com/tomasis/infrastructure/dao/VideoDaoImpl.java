package com.tomasis.infrastructure.dao;

import com.tomasis.core.model.YoukuBasic;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by adiadi1228 on 2015/2/11.
 */
@Repository
@Transactional
public class VideoDaoImpl extends JdbcDaoSupport implements VideoDao {
    private static String FIND_BY_KEYWORD = "select * from youkubasic where name like %?%";
    @Override
    public List<YoukuBasic> findByKeyword(String keyword) {
        List<YoukuBasic> result = new ArrayList<YoukuBasic>();
        List<Map<String,Object>> map= getJdbcTemplate().queryForList(FIND_BY_KEYWORD,keyword);
        if(map==null ||map.size()==0) return new ArrayList<>();
        for(Map<String,Object> valueMap : map){
            YoukuBasic y = new YoukuBasic();
            y.setId((Integer)valueMap.get("id"));
            y.setName((String)valueMap.get("name"));
            y.setBasicTag((String)valueMap.get("basicTag"));
            y.setPicUrl((String)valueMap.get("picUrl"));
            y.setJsonInfo((String)valueMap.get("jsonInfo"));
            y.setBasicUrl((String)valueMap.get("basicUrl"));
            result.add(y);
        }
        return result;
    }
}
