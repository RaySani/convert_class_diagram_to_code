/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl_class_diagram.Order;

import com.mycompany.rpl_class_diagram.Customer.Customer;
import com.mycompany.rpl_class_diagram.Product.Product;

/**
 *
 * @author ASUS
 */
public class Order {
    private Product[] produk;
    private String status;
    private String kodePemesanan;
    private int hargaBarang;
    private int jumlahBarang;

    public Order(Product[] produk, int jumlahBarang) {
        this.produk = produk;
        this.jumlahBarang = jumlahBarang;
    }
    public Order() {

    }
    public Product[] getProduk() {
        return produk;
    }

    public void setProduk(Product produk) {
        int daftarProduk = 0;
        this.produk[daftarProduk] = produk;
        daftarProduk++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKodePemesanan() {
        return kodePemesanan;
    }

    public void setKodePemesanan(String kodePemesanan) {
        this.kodePemesanan = kodePemesanan;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    public void lihatOrderDetail(){
        int total = 0;
        System.out.println("=========Order Detail=============");
        for (int i = 0; i<produk.length;i++){
            if(produk[i] != null){
                System.out.println("Nama Barang: "+produk[i].getProduct());
                System.out.println("Harga :Rp "+produk[i].getHarga());
                System.out.println("Jumlah Barang: "+ this.jumlahBarang);
                total +=  produk[i].getHarga()*this.jumlahBarang; 
            }
            System.out.println("");
        }
        System.out.println("Total Harga: "+total);
    }
    public void hapusItemKeKeranjang(Product produk){
        if (this.produk == null) {
        System.out.println("Tidak Ada Produk");
    } else {
        boolean found = false;
        for (int i = 0; i < this.produk.length; i++) {
            if (this.produk[i] != null && this.produk[i].equals(produk)) {
                this.produk[i] = null;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Produk tidak ditemukan di dalam keranjang.");
        } else {
            // Geser elemen-elemen di array jika diperlukan
            for (int i = 0; i < this.produk.length - 1; i++) {
                if (this.produk[i] == null) {
                    this.produk[i] = this.produk[i + 1];
                    this.produk[i + 1] = null;
                }
            }
        }
    }
    }
    public void tambhakanItemKeKeranjang(Product produk, int jumlahBarang){
        if (this.produk == null) {
            this.produk = new Product[1];
            this.produk[0] = produk;
            this.jumlahBarang = jumlahBarang;
        } else {
            int panjangItem = this.produk.length;
            Product[] tempArray = new Product[panjangItem + 1];
            System.arraycopy(this.produk, 0, tempArray, 0, panjangItem);
            tempArray[panjangItem] = produk;
            this.produk = tempArray;
            this.jumlahBarang = jumlahBarang;
        }
    }
    public void batalkanPesanan(){
        System.out.println("Pesanan Anda Dibatalkan");
    }
    public void payment(){
        System.out.println("Berhasil Melakukan Pembayaran");
    }
}
