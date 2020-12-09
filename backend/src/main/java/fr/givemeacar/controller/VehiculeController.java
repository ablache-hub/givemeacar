package fr.givemeacar.controller;

import fr.givemeacar.model.Vehicule;
import fr.givemeacar.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController // Controller qui permet de réaliser des requêtes Http CRUD -> Api Rest

public class VehiculeController {

    @Autowired // instancie automatiquement le JPA
    private VehiculeRepository vehiculeRepository;

    // Renvoie tous nos produits
    @GetMapping(value="/Vehicule")
    List<Vehicule> allVehicule() {
        return vehiculeRepository.findAll();
    }

    // Renvoie un item via son id
    @GetMapping(value="/Vehicule/{id}")
    public Optional<Vehicule> vehiculeById(@PathVariable int id){
        return vehiculeRepository.findById(id);
    }

    // Créer un item
    @PostMapping(value="/Vehicule")
    public ResponseEntity<Void> createVehicule(@RequestBody Vehicule vehicule ) {
        Vehicule savedVehicule = vehiculeRepository.save(vehicule);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVehicule.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    // Mettre à jour un item déjà existant
    @PutMapping(value="/Vehicule")
    public void updateVehicule(@RequestBody Vehicule vehicule ) {
        vehiculeRepository.save(vehicule);
    }

    // Supprimer un item via son Id
    @DeleteMapping(value="/Vehicule/{id}")
    public void deleteVehicule(@PathVariable int id){
        vehiculeRepository.deleteById(id);
    }


}
