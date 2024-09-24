package com.fnma.controllers;

import com.fnma.models.Bio;
import com.fnma.services.BioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bio")
public class BioController {

    private final BioService bioService;

    @Autowired
    public BioController(BioService bioService) {
        this.bioService = bioService;
    }

    @GetMapping
    public List<Bio> getAllBiosHandler(){
        return bioService.findAll();
    }

    @PostMapping
    public Bio addNewBioHandler(@RequestBody Bio bio){
        return bioService.saveNewBio(bio);
    }

}
