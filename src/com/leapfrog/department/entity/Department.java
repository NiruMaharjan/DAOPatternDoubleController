/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.department.entity;

/**
 *
 * @author Lenovo
 */
public class Department {
    private int id;
    private String name,address,contact,email;
    private boolean status;

    public Department() {
    }

    public Department(int id, String name, String address, String contact, String email, boolean status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.status = status;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", email=" + email + ", status=" + status + '}';
    }
    
    
    
    
    
}
