package com.example.demotts_java.service;

import com.example.demotts_java.model.bo.Respon;
import com.example.demotts_java.model.bo.ResponPage;
import com.example.demotts_java.model.dto.sinhVienDto;
import com.example.demotts_java.model.entity.sinhVien;
import com.example.demotts_java.model.in.sinhVienIn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface sinhVienService {
    ResponPage getAll();
    Respon create(sinhVienIn sinhVienIn);
    Respon update(Integer Id ,sinhVienIn sinhVienIn);
    Respon delete(Integer Id);
}
