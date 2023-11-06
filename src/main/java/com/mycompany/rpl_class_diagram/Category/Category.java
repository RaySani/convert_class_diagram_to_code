/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl_class_diagram.Category;

/**
 *
 * @author ASUS
 */
public class Category {
    private String namaCategory;
    private String id;
    
    public Category(String namaCategory, String id) {
        this.namaCategory = namaCategory;
        this.id = id;
    }
    
    public String getNamaCategory() {
        return namaCategory;
    }

    public void setNamaCategory(String namaCategory) {
        this.namaCategory = namaCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void tampilkanKategory(){
        
    }
    
}
