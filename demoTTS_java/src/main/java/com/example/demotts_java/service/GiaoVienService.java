package com.example.demotts_java.service;

import com.example.demotts_java.model.bo.Respon;
import com.example.demotts_java.model.bo.ResponPage;
import com.example.demotts_java.model.in.GiaoVienIn;
import org.springframework.stereotype.Service;

@Service
public interface GiaoVienService {
    ResponPage getAllGV();
    Respon createGV(GiaoVienIn giaoVienIn);
    Respon updateGV(Integer Id,GiaoVienIn giaoVienIn);
    Respon deleteGv(Integer Id);
}
