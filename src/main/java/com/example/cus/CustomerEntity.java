package com.example.cus;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class CustomerEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String emailId;

    @Column
    private String category;

    public CustomerEntity(){

    }

    public CustomerEntity(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.category="regular";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
