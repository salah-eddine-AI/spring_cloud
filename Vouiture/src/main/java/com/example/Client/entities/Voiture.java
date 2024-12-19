package com.example.Client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String matricule;
    private String model;

    private Long idClient; // This could represent the client ID as a foreign key

    @Transient
    @ManyToOne
    private Client client; // The associated client object, not persisted directly

    public Voiture() {
    }

    public Voiture(Long id, String marque, String matricule, String model, Long idClient, Client client) {
        this.id = id;
        this.marque = marque;
        this.matricule = matricule;
        this.model = model;
        this.idClient = idClient;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getModel() {
        return model;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

}
