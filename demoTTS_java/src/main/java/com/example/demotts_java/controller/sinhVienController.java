package com.example.demotts_java.controller;

import com.example.demotts_java.model.in.sinhVienIn;
import com.example.demotts_java.service.sinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/students")
@CrossOrigin("*")
public class sinhVienController {
    @Autowired
    private sinhVienService sinhVienService;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(sinhVienService.getAll(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody sinhVienIn sinhVienIn){
        return new ResponseEntity<>(sinhVienService.create(sinhVienIn), HttpStatus.CREATED);
    }
    @PutMapping ("/{Id}")
    public ResponseEntity<?> update(@PathVariable Integer Id, @RequestBody sinhVienIn sinhVienIn){
        return new ResponseEntity<>(sinhVienService.update(Id,sinhVienIn), HttpStatus.OK);
    }
    @DeleteMapping ("/{Id}")
    public ResponseEntity<?> delete(@PathVariable Integer Id){
        return new ResponseEntity<>(sinhVienService.delete(Id), HttpStatus.OK);
    }
}
