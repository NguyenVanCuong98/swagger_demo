package com.example.demotts_java.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sinhvien")
public class sinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column
    private String name;
    @Column
    private String adress;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_gv")
    private GiaoVien giaoVien;

}
