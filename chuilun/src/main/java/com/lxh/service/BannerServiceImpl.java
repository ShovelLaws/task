package com.lxh.service;


import com.lxh.dao.BannerDao;
import com.lxh.pojo.po.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerDao bannerDao;
    public List<Banner> doGetAll() {
        return bannerDao.doGetAll();
    }

    public List<Banner> doGetById(int id) {
        return bannerDao.doGetById(id);
    }

    public List<Banner> doGetUpload() {
        return bannerDao.doGetUpload();
    }

    public boolean doUpdate(Banner banner) {
        return bannerDao.doUpdate(banner);
    }

    public boolean doCreate(Banner banner) {
        return bannerDao.doCreate(banner);
    }

    public boolean doDelete(int id) {
        return bannerDao.doDelete(id);
    }

    public boolean doLoad(int id,int status,int editor_id) {
        return bannerDao.doLoad(id,status,editor_id);
    }

}
