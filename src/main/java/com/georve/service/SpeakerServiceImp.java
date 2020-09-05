package com.georve.service;

import com.georve.model.Speaker;
import com.georve.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SpeakerService")
public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImp(){

    }

   public SpeakerServiceImp(SpeakerRepository repository){
       this.repository=repository;
   }

    public SpeakerRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }



    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
