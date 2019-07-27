package com.lxh.service;

import com.lxh.pojo.po.Title;
import com.lxh.pojo.vo.TitleVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TitleService {
    List<Title> doGetAll();
    Title doGetById(int id);
    List<Title> doGetUpload();
    List<TitleVo> doGetUploadSetList();
    List<Title> doGetUploadThemeList(int set_id);
    List<Title> doGetSetList();
    List<Title> doGetThemeList(int set_id);
    List<Title> doGetChildList(int id);
    boolean doUpdate(Title title);
    boolean doCreate(Title title);
    boolean doDelete(int id);
    boolean doLoad(int id, int status);
}
