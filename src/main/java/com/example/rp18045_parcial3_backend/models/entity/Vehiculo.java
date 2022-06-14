package com.example.rp18045_parcial3_backend.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @Column(name = "matricula", nullable = false, length = 10)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "propietario", nullable = false)
    @JsonBackReference
    private Conductor propietario;

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "color", length = 20)
    private String color;

    @Column(name = "anio")
    private Integer anio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Conductor getPropietario() {
        return propietario;
    }

    public void setPropietario(Conductor propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

}