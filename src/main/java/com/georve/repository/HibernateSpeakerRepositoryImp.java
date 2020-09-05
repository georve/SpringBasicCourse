package com.georve.repository;

import com.georve.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImp implements SpeakerRepository {


    public List<Speaker> findAll(){
        List<Speaker> speakers=new ArrayList<Speaker>();
        Speaker sp=new Speaker();
        sp.setFirstname("georman");
        sp.setLastname("calderon");
        speakers.add(sp);
        return speakers;
    }

}
