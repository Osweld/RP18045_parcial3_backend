package com.example.rp18045_parcial3_backend.service;

import com.example.rp18045_parcial3_backend.models.entity.Conductor;
import com.example.rp18045_parcial3_backend.models.entity.Vehiculo;

public interface ParcialService {

    Vehiculo saveVehiculo(Vehiculo vehiculo);
    Conductor getConductor(String licencia);
}
