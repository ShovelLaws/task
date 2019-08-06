package com.lxh.dao;

import com.lxh.po.Profession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionMapper {
    public List<Profession> getAllProfession();
}