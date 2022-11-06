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
@Table(name = "purchase_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;

    @Column
    private String Date;

    @Column
    private String Address;

    @Column
    private String City;

    @Column
    private Double TotalPrice;

    @Column
    private int TotalQty;

    @JoinColumn(name = "CusID", referencedColumnName = "UserID", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    
    private User user;
    
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails = new ArrayList<>();
     
    public Order() {

    }

    public Order(int OrderID, String Date, String Address, String City, Double TotalPrice, int TotalQty, User user) {
        this.OrderID = OrderID;
        this.Date = Date;
        this.Address = Address;
        this.City = City;
        this.TotalPrice = TotalPrice;
        this.TotalQty = TotalQty;
        this.user = user;
    }
    
    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public int getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(int TotalQty) {
        this.TotalQty = TotalQty;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
