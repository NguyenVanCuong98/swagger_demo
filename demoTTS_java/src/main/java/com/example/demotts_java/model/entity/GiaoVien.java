package com.example.demotts_java.model.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Collection;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "giaovien")
public class GiaoVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column
    private String nameGv;
   @OneToMany(mappedBy = "giaoVien",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Collection<sinhVien> sinhVien;
    @PreRemove
    private void preRemove(){
         sinhVien.forEach(sinhVien -> sinhVien.setGiaoVien(null));
    }
}
