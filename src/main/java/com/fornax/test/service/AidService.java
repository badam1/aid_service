package com.fornax.test.service;

/*
 * Created by Adam Bodansky on 2017.06.06..
 */


import com.fornax.test.domain.Aid;
import com.fornax.test.repository.AidRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AidService {

    private static final Logger log = LoggerFactory.getLogger(AidService.class);

    private final AidRepository aidRepository;

    @Autowired
    public AidService(AidRepository aidRepository) {
        this.aidRepository = aidRepository;
    }

    public List<Aid> getAllAid() {
        log.info("getAllAid()");
        return aidRepository.findAll();
    }
}
