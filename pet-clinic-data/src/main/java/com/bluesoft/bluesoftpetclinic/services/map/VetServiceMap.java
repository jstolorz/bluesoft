package com.bluesoft.bluesoftpetclinic.services.map;

import com.bluesoft.bluesoftpetclinic.model.Vet;
import com.bluesoft.bluesoftpetclinic.services.CrudService;

import java.util.Set;

class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
      super.deleteById(id);
    }

    @Override
    public void delete(final Vet vet) {

    }

    @Override
    public Vet save(final Vet vet) {
        return super.save(vet.getId(),vet);
    }

    @Override
    public Vet findById(final Long id) {
        return null;
    }
}
