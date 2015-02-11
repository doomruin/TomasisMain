package com.tomasis.core.service;

import com.tomasis.core.model.YoukuBasic;
import com.tomasis.infrastructure.dao.VideoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adiadi1228 on 2015/2/11.
 */
@Service("videoService")
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoDao videoDao;
    @Override
    public List<YoukuBasic> search(String keyword) {
        System.out.println("hahhahah");
        return videoDao.findByKeyword(keyword);

    }
}
