package com.example.demotts_java.service.impl;

import com.example.demotts_java.mapper.GiaoVienMapper;
import com.example.demotts_java.model.bo.Respon;
import com.example.demotts_java.model.bo.ResponPage;
import com.example.demotts_java.model.dto.GiaoVienDto;
import com.example.demotts_java.model.entity.GiaoVien;
import com.example.demotts_java.model.entity.sinhVien;
import com.example.demotts_java.model.in.GiaoVienIn;
import com.example.demotts_java.repository.GiaoVienRepository;
import com.example.demotts_java.repository.sinhVienRepository;
import com.example.demotts_java.service.GiaoVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GiaoVienImpl implements GiaoVienService {

    @Autowired
    private GiaoVienRepository giaoVienRepository;

    @Override
    public ResponPage getAllGV() {
        List<GiaoVien> list = giaoVienRepository.findAll();
        List<GiaoVienDto> listDto = list.stream().map(GiaoVienMapper::mapEntity).collect(Collectors.toList());
        return new ResponPage("success", listDto);
    }

    @Override
    public Respon createGV(GiaoVienIn giaoVienIn) {
        GiaoVien giaoVien = GiaoVienMapper.mapIn(giaoVienIn);
        giaoVienRepository.save(giaoVien);
        return new Respon(true, "add sucess");
    }

    @Override
    public Respon updateGV(Integer Id, GiaoVienIn giaoVienIn) {
        GiaoVien giaoVien = giaoVienRepository.getById(Id);
        giaoVien.setId(Id);
        giaoVien.setNameGv(giaoVienIn.getNameGv());
        giaoVienRepository.save(giaoVien);
        return new Respon(true, "update success");
    }

    @Override
    public Respon deleteGv(Integer Id) {
        GiaoVien giaoVien = giaoVienRepository.getById(Id);
        giaoVienRepository.delete(giaoVien);
        return new Respon(true,"delete success");
    }
}
