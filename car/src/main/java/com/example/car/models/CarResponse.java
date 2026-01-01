package com.example.car.models;

import com.example.car.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder

public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricue;
    private Client client;

    public CarResponse() {
    }

    public CarResponse(Long id, String brand, String model, String matricue, Client client) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricue = matricue;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMatricue() {
        return matricue;
    }

    public void setMatricue(String matricue) {
        this.matricue = matricue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}