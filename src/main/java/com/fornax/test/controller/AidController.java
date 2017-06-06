package com.fornax.test.controller;

/*
 * Created by Adam Bodansky on 2017.06.06..
 */

import com.fornax.test.domain.Aid;
import com.fornax.test.service.AidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AidController {

    private static final Logger log = LoggerFactory.getLogger(AidController.class);

    private final AidService aidService;

    @Autowired
    public AidController(AidService aidService) {
        this.aidService = aidService;
    }

    @GetMapping("/aid-list")
    public ResponseEntity<List<Aid>> getAllAids() {
        log.info("getAllAids()");
        List<Aid> aidList = aidService.getAllAid();
        return new ResponseEntity<>(aidList, HttpStatus.OK);
    }
}
