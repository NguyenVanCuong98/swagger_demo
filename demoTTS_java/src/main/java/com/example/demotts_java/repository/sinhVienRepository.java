package com.example.demotts_java.repository;

import com.example.demotts_java.model.entity.sinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface sinhVienRepository extends JpaRepository<sinhVien, Integer> {
    sinhVien getById(Integer Id);
}
