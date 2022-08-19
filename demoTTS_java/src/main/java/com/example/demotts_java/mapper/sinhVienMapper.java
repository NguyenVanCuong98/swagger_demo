package com.example.demotts_java.mapper;

import com.example.demotts_java.model.dto.sinhVienDto;
import com.example.demotts_java.model.entity.sinhVien;
import com.example.demotts_java.model.in.sinhVienIn;

public class sinhVienMapper {
    public static sinhVien map(sinhVienIn sinhVienIn){
        sinhVien sinhVien = new sinhVien();
        sinhVien.setId(sinhVienIn.getId());
        sinhVien.setName(sinhVienIn.getName());
        sinhVien.setAdress(sinhVienIn.getAdress());
        return sinhVien;
    }
    public static sinhVienDto mapASD(sinhVien sinhVien){
        sinhVienDto sinhVienDto = new sinhVienDto();
        sinhVienDto.setId(sinhVien.getId());
        sinhVienDto.setName(sinhVien.getName());
        sinhVienDto.setAdress(sinhVien.getAdress());
        if(sinhVien.getGiaoVien()==null){
            sinhVienDto.setNameGv(null);
        }else {
            sinhVienDto.setNameGv(sinhVien.getGiaoVien().getNameGv());
        }
        return sinhVienDto;
    }
}
