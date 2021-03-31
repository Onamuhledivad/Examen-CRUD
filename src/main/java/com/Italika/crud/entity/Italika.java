package com.Italika.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Italika {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String sku;
    private String fert;
    private String modelo;
    private String tipo;
    private long no_serie;
    private String fecha;

    public Italika(){
    }

    public Italika(int id, String sku, String fert, String modelo, String tipo, long no_serie, String fecha){
        this.id = id;
        this.sku = sku;
        this.fert = fert;
        this.modelo = modelo;
        this.tipo = tipo;
        this.no_serie = no_serie;
        this.fecha = fecha;

    }

    public int getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public String getFert() {
        return fert;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public long getNo_serie() {
        return no_serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setFert(String fert) {
        this.fert = fert;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNo_serie(long no_serie) {
        this.no_serie = no_serie;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }






}