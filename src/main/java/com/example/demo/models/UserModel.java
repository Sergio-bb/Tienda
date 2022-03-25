package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserModel {

    @Id
    @Column(nullable = false, unique = true)
    private int id;
    private String name;
    private String lastName;
    private String password;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    } 
}
