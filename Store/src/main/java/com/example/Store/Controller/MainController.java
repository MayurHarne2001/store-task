package com.example.Store.Controller;

import com.example.Store.Dto.Dto;
import com.example.Store.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/output")
    public ResponseEntity<List<Dto>> getOutput(@RequestParam String name) {
        return new ResponseEntity<>(mainService.getoutput(name), HttpStatus.OK);
    }
}