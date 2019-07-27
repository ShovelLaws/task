package com.lxh.service;

import com.lxh.pojo.po.Works;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WorksService {
    List<Works> doGetAll();
    Works doGetById(int id);
    List<Works> doGetUpload();
    List<Works> doGetList(int title_id,int page,int size);
    List<Works> doSearch( String words,int start,int size);
    boolean doUpdate(Works works);
    boolean doCreate(Works works);
    boolean doDelete(int id);
    boolean doLoad(List<Integer> ids,int status);
}
