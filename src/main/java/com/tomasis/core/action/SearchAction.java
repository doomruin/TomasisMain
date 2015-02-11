package com.tomasis.core.action;

import com.tomasis.common.BaseAction;
import com.tomasis.core.model.YoukuBasic;
import com.tomasis.core.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by adiadi1228 on 2015/2/11.
 */
public class SearchAction extends BaseAction {

    @Autowired
    private VideoService videoService;
    private String keyword;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String video(){
        List<YoukuBasic> aa = videoService.search(keyword);

        return null;
    }
}
