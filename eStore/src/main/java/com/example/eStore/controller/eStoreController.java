package com.example.eStore.controller;

import com.example.eStore.model.eStore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/estores")
public class eStoreController {
    @PostMapping
    public  void createStore(@RequestBody eStore estore){}

    @GetMapping
    public List<eStore> getStore(){return  null;}

    @GetMapping("/{estoreId}")
    public List<eStore> getStore(@PathVariable("estoreId") Long estoreId){
        return null;
    }

    @DeleteMapping("/{estoreId}")
    public void deleteStore(@PathVariable("estoreId")Long estoreId){

    }

    @PutMapping
    public  void updateStore(@RequestBody eStore estore){}


}
