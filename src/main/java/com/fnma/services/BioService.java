package com.fnma.services;

import com.fnma.daos.BioDAO;
import com.fnma.models.Bio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BioService {

    private final BioDAO bioDAO;

    @Autowired
    public BioService(BioDAO bioDAO) {
        this.bioDAO = bioDAO;
    }

    public Bio saveNewBio(Bio bio){
        return bioDAO.save(bio);
    }

    public List<Bio> findAll(){
        return bioDAO.findAllByOrderByNameAsc();
    }
}
