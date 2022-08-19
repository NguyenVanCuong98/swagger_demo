package com.example.demotts_java.repository;

import com.example.demotts_java.model.entity.GiaoVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiaoVienRepository extends JpaRepository<GiaoVien,Integer> {
    GiaoVien getById(Integer Id);
}
