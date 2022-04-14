package com.bluesoft.bluesoftpetclinic.services;

import com.bluesoft.bluesoftpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
