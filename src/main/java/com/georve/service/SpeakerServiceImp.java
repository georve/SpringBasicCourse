package com.georve.service;

import com.georve.model.Speaker;
import com.georve.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository;

   public SpeakerServiceImp(SpeakerRepository repository){
       this.repository=repository;
   }

    public SpeakerRepository getRepository() {
        return repository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }



    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
