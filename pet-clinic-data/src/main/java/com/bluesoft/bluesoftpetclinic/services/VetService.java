package com.bluesoft.bluesoftpetclinic.services;

import com.bluesoft.bluesoftpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
