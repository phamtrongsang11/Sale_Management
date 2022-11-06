/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Category;
import DAL.Product;
import DAL.ProductDAL;
import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class ProductBLL {
    private ArrayList<Product> prodList = new ArrayList<>();
    private ProductDAL prodDAL = new ProductDAL();

    public ProductBLL() {

    }

    public ArrayList<Product> getAllProducts(){
        prodList = new ArrayList(prodDAL.getAllProducts());
        return prodList;
    }
    
    public Product getProductById(int id){
        Product prod = prodDAL.getProductById(id);
        return prod;
    }

    public boolean saveProduct(Product prod){
        return prodDAL.saveProduct(prod);
    }

   public boolean updateProduct(Product prod){
        return prodDAL.updateProduct(prod);
    }
   public boolean deleteProductById(int id){
        return prodDAL.deleteProductById(id);
    }
    
    public ArrayList<Product> findProductByName(String name){
        
        ArrayList<Product> result = new ArrayList<>();

        for (Product p : prodList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;

    }

    public ArrayList<Product> ReadProductByNumPage(ArrayList<Product> prodList,int page, int numRecord){
       
        //onlList = this.readAllOnlineCourse();
        int startRecord = (page - 1) * numRecord;
        int endRecord = page * numRecord;

        return new ArrayList<Product>(prodList.subList(startRecord, Math.min(endRecord, prodList.size())));

    }
}
