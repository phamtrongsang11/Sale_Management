/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Product;
import DAL.ProductDAL;
import DAL.User;
import DAL.UserDAL;
import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class UserBLL {
    private ArrayList<User> userList = new ArrayList<>();
    private UserDAL userDAL = new UserDAL();

    public UserBLL() {

    }

    public ArrayList<User> getAllCustomer(){
        userList = new ArrayList(userDAL.getAllCustomer());
        return userList;
    }
    
    public ArrayList<User> getAllEmployee(){
        userList = new ArrayList(userDAL.getAllEmployee());
        return userList;
    }
    
    public User getUserById(int id){
        User user = userDAL.getUserById(id);
        return user;
    }

    public boolean saveUser(User user){
        return userDAL.saveUser(user);
    }

   public boolean updateUser(User user){
        return userDAL.updateUser(user);
    }
   public boolean deleteUserById(int id){
        return userDAL.deleteUserById(id);
    }
    
    public ArrayList<User> findUserByName(String name){
        
        ArrayList<User> result = new ArrayList<>();

        for (User u : userList) {
            if (u.getFirstName().toLowerCase().contains(name.toLowerCase())) {
                result.add(u);
            }
        }
        return result;

    }

    public ArrayList<User> ReadUserByNumPage(ArrayList<User> userList,int page, int numRecord){
       
        //onlList = this.readAllOnlineCourse();
        int startRecord = (page - 1) * numRecord;
        int endRecord = page * numRecord;

        return new ArrayList<User>(userList.subList(startRecord, Math.min(endRecord, userList.size())));

    }
}
