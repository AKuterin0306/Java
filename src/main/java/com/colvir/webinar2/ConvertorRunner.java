package com.colvir.webinar2;

import com.colvir.webinar2.impl.ConvTemperaturesServiceImpl;

public class ConvertorRunner {

    public static void main(String[] args) {
        com.colvir.webinar2.ConvTemperatures convertor = new ConvTemperaturesServiceImpl();
        System.out.println(convertor.cel2kel(2));
        System.out.println(convertor.kel2cel(10));
        }
}
