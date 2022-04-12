package com.bluesoft.bluesoftpetclinic.services.map;

import com.bluesoft.bluesoftpetclinic.model.Owner;
import com.bluesoft.bluesoftpetclinic.services.CrudService;

import java.util.Set;

class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(final Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(final Long id) {
        return super.findById(id);
    }
}
