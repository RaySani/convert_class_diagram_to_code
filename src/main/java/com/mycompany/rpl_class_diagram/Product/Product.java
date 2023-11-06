/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl_class_diagram.Product;

import com.mycompany.rpl_class_diagram.Category.Category;

/**
 *
 * @author ASUS
 */
public class Product {
    private String product;
    private String desc;
    private String id;
    private int harga;
    private Category[] katergori;

    public Product(String product, String desc, String id, int harga, Category[] katergori) {
        this.product = product;
        this.desc = desc;
        this.id = id;
        this.harga = harga;
        this.katergori = katergori;
    }
    
    
    public Category[] getKatergori() {
        return katergori;
    }

    public void setKatergori(Category kategori) {
        int daftarCat = 0;
        this.katergori[daftarCat] = kategori ;
        daftarCat++;
    }
    
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void tampilkanProduk(){
        int i;
        System.out.println("Nama Barang: "+this.product);
        System.out.println("Description: "+this.desc);
        System.out.println("Harga: "+this.harga);
        System.out.println("Kategori: ");
        for (i=0; i<katergori.length;i++){
            System.out.println(katergori[i].getNamaCategory()+" ");
        }
        System.out.println("");
    }
    
}
