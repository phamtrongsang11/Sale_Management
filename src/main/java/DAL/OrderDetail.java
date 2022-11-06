/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import javax.persistence.*;

/**
 *
 * @author phamt
 */
@Entity
@Table(name = "Order_Detail")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailID primaryKey = new OrderDetailID();
    
    @ManyToOne
    @MapsId("OrderID")
    @JoinColumn(name = "OrderID")
    private Order order;

    @ManyToOne
    @MapsId("ProductID")
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column
    private Double Price;

    @Column
    private int Qty;

    @Column
    private Double Subtotal;

    public OrderDetail() {

    }

    public OrderDetail(Order order, Product product, Double Price, int Qty, Double Subtotal) {
        this.order = order;
        this.product = product;
        this.Price = Price;
        this.Qty = Qty;
        this.Subtotal = Subtotal;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
//        this.primaryKey.setProductID(product.getProductID());
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }

}
