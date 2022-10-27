package com.personal.Mycity.service;

import com.personal.Mycity.repository.SubrouteRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
@AllArgsConstructor
public class SubrouteService {

    @Autowired
    private static SubrouteRepository subrouteRepository;
}
