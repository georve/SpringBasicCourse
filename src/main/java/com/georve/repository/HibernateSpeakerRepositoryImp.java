package com.georve.repository;

import com.georve.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("SpeakerRepository")
public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

    @Autowired
    private Calendar cal;


    @Value("#{T(java.lang.Math).random()*100}")
    private double seedNum;


    public List<Speaker> findAll(){
        List<Speaker> speakers=new ArrayList<Speaker>();
        Speaker sp=new Speaker();
        sp.setFirstname("georman");
        sp.setLastname("calderon");
        sp.setSeedNum(seedNum);
        System.out.println("cald"+cal.getTime());
        speakers.add(sp);
        return speakers;
    }

}
