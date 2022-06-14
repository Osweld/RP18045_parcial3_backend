package com.example.rp18045_parcial3_backend.controllers;

import com.example.rp18045_parcial3_backend.models.entity.Conductor;
import com.example.rp18045_parcial3_backend.models.entity.Vehiculo;
import com.example.rp18045_parcial3_backend.models.repository.ConductorRepository;
import com.example.rp18045_parcial3_backend.models.repository.VehiculoRepository;
import com.example.rp18045_parcial3_backend.service.ParcialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/parcial")
public class Parcial {

    @Autowired
    private ParcialService parcialService;


    @GetMapping("/caracteres/{caracteres}")
    ResponseEntity<Map<String, Object>> caracteres(@PathVariable String caracteres) {
        Map<String, Object> body = new HashMap<>();
        body.put("total", caracteres.length());
        String caracteres_separados = "";
        for (int i = 0; i < caracteres.length(); i++) {
            caracteres_separados += caracteres.charAt(i) + " ";
        }
        body.put("caracteres", caracteres_separados);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("/vehiculo")
    ResponseEntity<Vehiculo> guardarVehiculo(@RequestBody Vehiculo vehiculo){
        return new ResponseEntity<>(parcialService.saveVehiculo(vehiculo),HttpStatus.CREATED);
    }

    @GetMapping("conductor/{licencia}")
    ResponseEntity<Conductor> guardarVehiculo(@PathVariable String licencia){
        return new ResponseEntity<>(parcialService.getConductor(licencia),HttpStatus.CREATED);
    }
}
