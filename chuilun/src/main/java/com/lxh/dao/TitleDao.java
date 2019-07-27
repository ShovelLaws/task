package com.lxh.dao;

import org.apache.ibatis.annotations.Param;
import com.lxh.pojo.po.Title;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TitleDao {
    List<Title> doGetAll();
    Title doGetById(int id);
    List<Title> doGetUpload();
    List<Title> doGetSetList();
    List<Title> doGetThemeList(int set_id);
    List<Title> doGetUploadSetList();
    List<Title> doGetUploadThemeList(int set_id);
    List<Title> doGetChildList(int id);
    List<Title> doGetChild(List<Integer> ids);
    boolean doUpdate(Title title);
    boolean doCreate(Title title);
    boolean doDelete(int id);
    boolean doLoad(@Param("id") int id, @Param("status") int status);
}
