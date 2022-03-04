package com.elements.elements;

import javax.persistence.*;

@Entity
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column (name="ENNAME")
    private String enName;

    @Column (name="SVNAME")
    private String svName;

    //Empty Constructor
    public Element(){
    }

    //Main Constructor
    public Element(Long id, String enName, String svName) {
        this.id = id;
        this.enName = enName;
        this.svName = svName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getSvName() {
        return svName;
    }

    public void setSvName(String svName) {
        this.svName = svName;
    }
}
