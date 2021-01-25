package com.softplan.cadastropessoasapi.controller;

import com.softplan.cadastropessoasapi.services.SourceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author erik_
 * Data Criacao: 24/01/2021 - 14:40
 */
@RequestMapping("/rest/source")
@RestController
public class SourceController {

    @Autowired
    private SourceServices sourceServices;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getUrlFontes(){
        return ResponseEntity.ok(sourceServices.getUrlRepositorio());
    }
}
