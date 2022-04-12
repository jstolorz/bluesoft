package com.bluesoft.bluesoftpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    void setId(final Long id) {
        this.id = id;
    }
}
