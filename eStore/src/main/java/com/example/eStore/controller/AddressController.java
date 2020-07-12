package com.example.eStore.controller;

import com.example.eStore.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/addresses")
public class AddressController {

    @PostMapping
    void createAddress(@RequestBody Address address){

    }

    @PutMapping
    void updateAddress(@RequestBody Address address){

    }

    @GetMapping
    List<Address> getAllAddresses(){
        return null;
    }

    @GetMapping("/{addressId}")
    public Address getAddress(@PathVariable Long addressId){
        return null;
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable("addressId") Long addressId)
    {

    }
}