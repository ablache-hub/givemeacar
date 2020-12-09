package fr.givemeacar.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name="vehicule")
public @Data class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String marque;
    private String modele;
    private int price;
    private boolean state;
    private int coordonneesGPS;



}
