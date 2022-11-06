/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author phamt
 */
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CateID;

    @Column
    private String Name;

    @Column
    private String Description;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList();
    
    public Category(){
        
    }

    public Category(String Name, String Description) {
        this.Name = Name;
        this.Description = Description;
    }

    public int getCateID() {
        return CateID;
    }

    public void setCateID(int CateID) {
        this.CateID = CateID;
    }

    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }    

}
