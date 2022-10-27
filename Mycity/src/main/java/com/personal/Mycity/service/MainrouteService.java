package com.personal.Mycity.service;

import com.personal.Mycity.model.Mainroute;
import com.personal.Mycity.repository.MainrouteRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Data
@Service
@AllArgsConstructor
public class MainrouteService {

    @Autowired
    private static MainrouteRepository mainrouteRepository;

    public void AddMainroute(Mainroute mainroute){
//        mainroute.setPicByte(Base64.getEncoder().encodeToString(mainroute.));
    }
}
