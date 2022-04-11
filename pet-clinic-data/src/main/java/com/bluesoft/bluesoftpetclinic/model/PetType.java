package com.bluesoft.bluesoftpetclinic.model;

class PetType extends BaseEntity{
    private String name;

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }
}
