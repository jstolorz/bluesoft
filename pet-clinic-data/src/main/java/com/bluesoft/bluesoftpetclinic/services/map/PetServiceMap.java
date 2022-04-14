package com.bluesoft.bluesoftpetclinic.services.map;

import com.bluesoft.bluesoftpetclinic.model.Pet;
import com.bluesoft.bluesoftpetclinic.services.CrudService;
import com.bluesoft.bluesoftpetclinic.services.PetService;

import java.util.Set;

class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Pet object) {
       super.delete(object);
    }

    @Override
    public Pet save(final Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(final Long id) {
        return super.findById(id);
    }
}
