package com.tomasis.core.service;

import com.tomasis.core.model.YoukuBasic;

import java.util.List;

/**
 * Created by adiadi1228 on 2015/2/11.
 */
public interface VideoService {
    public List<YoukuBasic> search(String keyword);
}
