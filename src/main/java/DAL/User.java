/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author phamt
 */
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;

    @Column
    private String FirstName;

    @Column
    private String LastName;

    @Column
    private String Email;

    @Column
    private String Password;

    @Column
    private String Phone;

    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    @Column
    private boolean IsEmployee;

    public User() {

    }

    public User(String FirstName, String LastName, String Email, String Password, String Phone, boolean IsEmployee) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.IsEmployee = IsEmployee;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order orders) {
        orders.setUser(this);
        this.orders.add(orders);
    }

    public boolean isIsEmployee() {
        return IsEmployee;
    }

    public void setIsEmployee(boolean IsEmployee) {
        this.IsEmployee = IsEmployee;
    }

}
