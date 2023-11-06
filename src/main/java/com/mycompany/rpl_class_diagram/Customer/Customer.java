/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl_class_diagram.Customer;

/**
 *
 * @author ASUS
 */
public class Customer {
    private String username;
    private String alamat;
    private String password;
    private String email;
    private String nomorHP;

    public Customer(String username, String alamat, String password, String email, String nomorHP) {
        this.username = username;
        this.alamat = alamat;
        this.password = password;
        this.email = email;
        this.nomorHP = nomorHP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }
    
    public void login(String username, String password){
        if(this.username.equals(username)&& this.password.equals(password)){
            System.out.println("Berhasil Login");
        }
    }
    public void editProfilePengguna(String username, String alamat, String password, String email, String nomorHP){
        this.username = username;
        this.alamat = alamat;
        this.password = password;
        this.email = email;
        this.nomorHP = nomorHP;
        System.out.println("Edit Profile Berhasil");
        System.out.println("");
    }
    
}
