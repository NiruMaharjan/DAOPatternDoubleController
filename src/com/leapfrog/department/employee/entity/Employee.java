/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.department.employee.entity;

/**
 *
 * @author Lenovo
 */
public class Employee {
    private int id;
    private String name,addres,contact;
    private boolean status;

    public Employee() {
    }

    public Employee(int id, String name, String addres, String contact, boolean status) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.contact = contact;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", addres=" + addres + ", contact=" + contact + ", status=" + status + '}';
    }
    
    
    
    
    
}
