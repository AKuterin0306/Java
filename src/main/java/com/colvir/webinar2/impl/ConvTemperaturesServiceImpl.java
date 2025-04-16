package com.colvir.webinar2.impl;

import com.colvir.webinar2.ConvTemperatures;
import org.springframework.stereotype.Component;

@Component("ConvTemperatures")
public class ConvTemperaturesServiceImpl implements ConvTemperatures {

    @Override
    public float cel2kel(float a) {
        return a - 273.15f;
    }

    @Override
    public float kel2cel(float a) {
        return a + 273.15f;
    }
}