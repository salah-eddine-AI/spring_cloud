package com.example.Client.controllers;

import com.example.Client.entities.Voiture;
import com.example.Client.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping
    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }

    @GetMapping("/{id}")
    public Voiture findById(@PathVariable Long id) throws Exception {
        return voitureRepository.findById(id)
                .orElseThrow(() -> new Exception("Client not found"));
    }
}
