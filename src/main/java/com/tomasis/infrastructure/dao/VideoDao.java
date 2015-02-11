package com.tomasis.infrastructure.dao;

import com.tomasis.core.model.YoukuBasic;

import java.util.List;

/**
 * Created by adiadi1228 on 2015/2/11.
 */
public interface VideoDao {
    public List<YoukuBasic> findByKeyword(String keyword);
}
