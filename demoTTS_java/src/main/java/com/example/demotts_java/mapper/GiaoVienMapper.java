package com.example.demotts_java.mapper;

import com.example.demotts_java.model.dto.GiaoVienDto;
import com.example.demotts_java.model.entity.GiaoVien;
import com.example.demotts_java.model.in.GiaoVienIn;

public class GiaoVienMapper {
    public static GiaoVien mapIn(GiaoVienIn giaoVienIn){
        GiaoVien giaoVien = new GiaoVien();
        giaoVien.setId(giaoVienIn.getId());
        giaoVien.setNameGv(giaoVienIn.getNameGv());
        return giaoVien;
    }
    public static GiaoVienDto mapEntity(GiaoVien giaoVien){
        GiaoVienDto giaoVienDto = new GiaoVienDto();
        giaoVienDto.setId(giaoVien.getId());
        giaoVienDto.setNameGv(giaoVien.getNameGv());
        return giaoVienDto;
    }
}
