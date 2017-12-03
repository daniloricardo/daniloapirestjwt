package com.example.demo.controller;

import com.example.demo.DatabaseService;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ClientController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    DatabaseService databaseService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value="/client",method = {RequestMethod.OPTIONS,RequestMethod.GET})
    @ResponseBody
    public List<CustomerModel> get(){

        return customerRepository.findAll();
    }

    @GetMapping("create")
    @ResponseBody public void create(){
        databaseService.create();
    }

    @RequestMapping(
            value = "/**",
            method = RequestMethod.OPTIONS
    )
    public ResponseEntity handle() {
        return new ResponseEntity(HttpStatus.OK);
    }

}
