/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl_class_diagram;

import com.mycompany.rpl_class_diagram.Category.Category;
import com.mycompany.rpl_class_diagram.Customer.Customer;
import com.mycompany.rpl_class_diagram.Order.Order;
import com.mycompany.rpl_class_diagram.Product.Product;

/**
 *
 * @author ASUS
 */
public class RPL_Class_Diagram {

    public static void main(String[] args) {
        Customer A = new Customer("Dio", "Jl.Pirus", "wargoat", "wargoat@gmail.com", "081212104080");
        Category C1 = new Category("Tanamanan", "1");
        Category C2 = new Category("Alat", "2");
        Category C3 = new Category("Best Seller", "3");
        Product p1 = new Product("Bibit Pisang", "lorem ipsum", "1", 5000, new Category[]{C1,C3});
        Product p2 = new Product("Pisau Pemotong Rumput", "lorem", "2", 10000, new Category[]{C2,C3});
        Order O = new Order();
        O.tambhakanItemKeKeranjang(p2, 2);
        O.tambhakanItemKeKeranjang(p1, 3);
        System.out.println("Username: "+A.getUsername());
        System.out.println("");
        p1.tampilkanProduk();
        p2.tampilkanProduk();
        A.editProfilePengguna("Sani", "Jl.Sukapura", "wargoat", "wargoat@gmail.com", "08123456789");
        System.out.println("Username:"+A.getUsername());
        System.out.println("");
        O.lihatOrderDetail();
        O.hapusItemKeKeranjang(p2);
        O.lihatOrderDetail();
        O.payment();
        
        
    }
}
