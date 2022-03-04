package com.elements.elements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Element {
    @Id
    @Column(name="ID")
    private Long id;

    @Column (name="NAME")
    private String name;

    public Element(){
    }

    public Element() (Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
