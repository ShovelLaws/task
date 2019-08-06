package com.lxh.service;

import com.lxh.dao.ProfessionMapper;
import com.lxh.po.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    ProfessionMapper professionMapper;
    public List<Profession> getAllProfession() {
        return professionMapper.getAllProfession();
    }
}
