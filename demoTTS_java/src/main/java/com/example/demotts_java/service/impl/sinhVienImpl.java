package com.example.demotts_java.service.impl;

import com.example.demotts_java.mapper.sinhVienMapper;
import com.example.demotts_java.model.bo.Respon;
import com.example.demotts_java.model.bo.ResponPage;
import com.example.demotts_java.model.dto.sinhVienDto;
import com.example.demotts_java.model.entity.GiaoVien;
import com.example.demotts_java.model.entity.sinhVien;
import com.example.demotts_java.model.in.sinhVienIn;
import com.example.demotts_java.repository.GiaoVienRepository;
import com.example.demotts_java.repository.sinhVienRepository;
import com.example.demotts_java.service.sinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class sinhVienImpl implements sinhVienService  {

    @Autowired
    private sinhVienRepository sinhVienRepository;

    @Autowired
    private GiaoVienRepository giaoVienRepository;
    @Override
    public ResponPage getAll() {
        List<sinhVien> list = sinhVienRepository.findAll();
        List<sinhVienDto> listDto = list.stream().map(sinhVienMapper::mapASD).collect(Collectors.toList());
        return new ResponPage("Success",listDto);
    }

    @Override
    public Respon create(sinhVienIn sinhVienIn) {
        sinhVien sinhVien = sinhVienMapper.map(sinhVienIn);
        GiaoVien giaoVien = giaoVienRepository.getById(sinhVienIn.getIdGv());
        sinhVien.setGiaoVien(giaoVien);
        sinhVienRepository.save(sinhVien);
        return new Respon(true,"add thành công Students");
    }

    @Override
    public Respon update(Integer Id, sinhVienIn sinhVienIn) {
        sinhVien sinhVien = sinhVienRepository.getById(Id);
        GiaoVien giaoVien = giaoVienRepository.getById(sinhVienIn.getIdGv());
        sinhVien.setGiaoVien(giaoVien);
        sinhVien.setName(sinhVienIn.getName());
        sinhVien.setAdress(sinhVienIn.getAdress());
        sinhVienRepository.save(sinhVien);
        return new Respon(true,"update thành công Students");
    }

    @Override
    public Respon delete(Integer Id) {
        sinhVien sinhVien = sinhVienRepository.getById(Id);
        sinhVienRepository.delete(sinhVien);
        return new Respon(true,"delete thành công Students");
    }
}
