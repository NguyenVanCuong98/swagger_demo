package com.example.demotts_java.controller;

import com.example.demotts_java.model.in.GiaoVienIn;
import com.example.demotts_java.model.in.sinhVienIn;
import com.example.demotts_java.service.GiaoVienService;
import com.example.demotts_java.service.sinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/giaovien")
@CrossOrigin("*")
public class GiaoVienContrtoller {
    @Autowired
    private GiaoVienService giaoVienService;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(giaoVienService.getAllGV(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> create( @RequestBody GiaoVienIn giaoVienIn){
        return new ResponseEntity<>(giaoVienService.createGV(giaoVienIn), HttpStatus.CREATED);
    }
    @PutMapping ("/{Id}")
    public ResponseEntity<?> update(@PathVariable Integer Id, @RequestBody GiaoVienIn giaoVienIn){
        return new ResponseEntity<>(giaoVienService.updateGV(Id,giaoVienIn), HttpStatus.OK);
    }
    @DeleteMapping ("/{Id}")
    public ResponseEntity<?> delete(@PathVariable Integer Id){
        return new ResponseEntity<>(giaoVienService.deleteGv(Id), HttpStatus.OK);
    }
}
