package com.corteza.pfafunca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaController {


    @GetMapping("/saluda")
    public String getSaluda () {
        System.out.println("Prueba controlador saluda");
        return "Prueba para deploy";
    }

}
