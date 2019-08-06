package com.lxh.service;

import com.lxh.po.Profession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
public interface ProfessionService {
    public List<Profession> getAllProfession();
}
