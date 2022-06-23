package com;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private int Number;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public int getNumber() {return Number;}
    public void setNumber(int number) {Number = number;}
}
