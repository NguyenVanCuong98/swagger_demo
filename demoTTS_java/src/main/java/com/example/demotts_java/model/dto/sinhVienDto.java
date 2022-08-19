package com.example.demotts_java.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class sinhVienDto {
        private Integer Id;
        private String name;
        private String adress;
        private String nameGv;
}
