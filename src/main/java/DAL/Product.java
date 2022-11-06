/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author phamt
 */
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductID;

    @Column(unique = true)
    private String Name;

    @Column
    private int Stock;

    @Column
    private double Price;

    @Column
    private String Description;

    @Column
    private String Image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CateID", nullable = false)
    private Category category;

    
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails = new ArrayList<>();
  

    public Product() {

    }

    public Product(String Name, int Stock, double Price, String Description, String Image, Category category) {

        this.Name = Name;
        this.Stock = Stock;
        this.Price = Price;
        this.Description = Description;
        this.Image = Image;
        this.category = category;
    }

    public Product(String Name, int Stock, double Price, String Description, Category category) {

        this.Name = Name;
        this.Stock = Stock;
        this.Price = Price;
        this.Description = Description;
        this.category = category;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
    
    public void addOrderDetails(OrderDetail oderDetail) {
        this.orderDetails.add(oderDetail);
    }
    

}
