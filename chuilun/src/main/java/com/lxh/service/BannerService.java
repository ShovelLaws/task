package com.lxh.service;

import com.lxh.pojo.po.Banner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BannerService {
    public List<Banner> doGetAll();
    public List<Banner> doGetById(int id);
    public List<Banner> doGetUpload();
    public boolean doUpdate(Banner banner);
    public boolean doCreate(Banner banner);
    public boolean doDelete(int id);
    public boolean doLoad(int id,int status,int editor_id);

}
