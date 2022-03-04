package com.elements.elements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Element {
    @Id
    @Column(name="ID")
    private Long id;

    @Column (name="ENNAME")
    private String enName;

    @Column (name="SVNAME")
    private String svName;

    public Element(){
    }

    public Element(Long id, String enName, String svName) {
        this.id = id;
        this.enName = enName;
        this.svName = svName;
    }
}
