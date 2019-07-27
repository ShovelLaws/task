package com.lxh.service;

import com.lxh.dao.WorksDao;
import com.lxh.pojo.po.Works;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {
    @Autowired
    WorksDao worksDao;
    public List<Works> doGetAll() {
        return worksDao.doGetAll();
    }

    public Works doGetById(int id) {
        return worksDao.doGetById(id);
    }

    public List<Works> doGetUpload() {
        return worksDao.doGetUpload();
    }

    public List<Works> doGetList(int title_id, int page, int size) {
        int start=(page-1)*size;
        return worksDao.doGetList(title_id,start,size);
    }
    public List<Works> doSearch( String words,int page,int size){
        int start=size*(page-1);
        return worksDao.doSearch(words,start,size);
    }

    public boolean doUpdate(Works works) {
        return worksDao.doUpdate(works);
    }

    public boolean doCreate(Works works) {
        return worksDao.doCreate(works);
    }

    public boolean doDelete(int id) {
        return worksDao.doDelete(id);
    }

    public boolean doLoad(List<Integer> ids, int status) {
        return false;
    }
}
