package com.example.demo;

import com.example.demo.model.AddressModel;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;

@Service
public class DatabaseService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    AddressRepository addressRepository;

    public void create(){

        AddressModel addressModel = new AddressModel();
        addressModel.setCep("02472-050");
        addressModel.setLogradouro("Rua Aida Gomes Toledo");
        addressModel.setNumero("100");
        addressModel.setComplemento("Apto 102 B");
        addressModel.setBairro("Imirim");
        addressModel.setCidade("São Paulo");

        addressRepository.save(addressModel);

        CustomerModel customerModel = new CustomerModel();
        customerModel.setCpf("123.456.789-25");
        customerModel.setDateRegister(new Date());
        customerModel.setName("Danilo Ricardo da Silva");
        customerModel.setAddresses(Arrays.asList(addressModel));



        AddressModel addressModel2 = new AddressModel();
        addressModel2.setCep("02472-050");
        addressModel2.setLogradouro("Rua Aida Gomes Toledo");
        addressModel2.setNumero("100");
        addressModel2.setComplemento("Apto 102 B");
        addressModel2.setBairro("Imirim");
        addressModel2.setCidade("São Paulo");


        addressRepository.save(addressModel2);

        CustomerModel customerModel2 = new CustomerModel();
        customerModel2.setCpf("899.124.789-25");
        customerModel2.setDateRegister(new Date());
        customerModel2.setName("Adriana Sodero Silva");
        customerModel2.setAddresses(Arrays.asList(addressModel2));


        customerRepository.save(customerModel);
        customerRepository.save(customerModel2);


    }
}
