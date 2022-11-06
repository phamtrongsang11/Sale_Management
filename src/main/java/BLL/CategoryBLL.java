/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Category;
import DAL.CategoryDAL;
import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class CategoryBLL {
    
    private ArrayList<Category> cateList = new ArrayList<>();
    private CategoryDAL cateDAL = new CategoryDAL();

    public CategoryBLL() {

    }

    public ArrayList<Category> getAllCategories(){
        cateList = new ArrayList(cateDAL.getAllCategories());
        return cateList;
    }
    
    public Category getAllCategory(int id){
        Category cate = cateDAL.getCategoryById(id);
        return cate;
    }

    public boolean saveCategory(Category cate){
        return cateDAL.saveCategory(cate);
    }

   public boolean updateCategory(Category cate){
        return cateDAL.updateCategory(cate);
    }
   public boolean deleteCategoryById(int id){
        return cateDAL.deleteCategoryById(id);
    }
    
    public ArrayList<Category> findCategoryByName(String name){
        
        ArrayList<Category> result = new ArrayList<>();

        for (Category c : cateList) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(c);
            }
        }
        return result;

    }

    public ArrayList<Category> ReadCategoryByNumPage(ArrayList<Category> cateList,int page, int numRecord){
       
        //onlList = this.readAllOnlineCourse();
        int startRecord = (page - 1) * numRecord;
        int endRecord = page * numRecord;

        return new ArrayList<Category>(cateList.subList(startRecord, Math.min(endRecord, cateList.size())));

    }
}
