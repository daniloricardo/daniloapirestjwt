package com.example.demo.controller;

import com.example.demo.DatabaseService;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    DatabaseService databaseService;

    @GetMapping("client")
    @ResponseBody
    public List<CustomerModel> get(){

        return customerRepository.findAll();
    }

    @GetMapping("create")
    @ResponseBody public void create(){
        databaseService.create();
    }

}
