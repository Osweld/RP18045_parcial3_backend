package com.example.rp18045_parcial3_backend.service;

import com.example.rp18045_parcial3_backend.models.entity.Conductor;
import com.example.rp18045_parcial3_backend.models.entity.Vehiculo;
import com.example.rp18045_parcial3_backend.models.repository.ConductorRepository;
import com.example.rp18045_parcial3_backend.models.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ParcialServiceImpl implements ParcialService{

    @Autowired
    private ConductorRepository conductorRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    @Transactional()
    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    @Transactional(readOnly = true)
    public Conductor getConductor(String licencia) {
        return conductorRepository.findById(licencia).orElseThrow();
    }
}
