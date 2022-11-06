/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author phamt
*/

@Embeddable
public class OrderDetailID implements Serializable {

    @Column(name = "OrderID")
    private int OrderID;

    @Column(name = "ProductID")
    private int ProductID;

    public OrderDetailID() {
    }

    public OrderDetailID(int OrderID, int ProductID) {
        this.OrderID = OrderID;
        this.ProductID = ProductID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.OrderID;
        hash = 97 * hash + this.ProductID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderDetailID other = (OrderDetailID) obj;
        if (this.OrderID != other.OrderID) {
            return false;
        }
        return this.ProductID == other.ProductID;
    }
    
    
}
