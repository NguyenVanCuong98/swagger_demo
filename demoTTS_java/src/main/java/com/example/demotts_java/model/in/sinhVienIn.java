package com.example.demotts_java.model.in;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class sinhVienIn {
    private Integer Id;
    private String name;
    private String adress;
    private Integer idGv;
}
