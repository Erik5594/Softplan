package com.softplan.cadastropessoasapi.services.impl;

import com.softplan.cadastropessoasapi.services.SourceServices;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author erik_
 * Data Criacao: 24/01/2021 - 14:37
 */
@Service
public class SourceServicesImpl implements SourceServices {
    private static String URL_CODIGO_FONTE = "https://github.com/Erik5594/Softplan";
    @Override
    public String getUrlRepositorio() {
        return URL_CODIGO_FONTE;
    }
}
