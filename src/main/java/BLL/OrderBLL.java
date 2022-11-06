/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Order;
import DAL.OrderDAL;
import DAL.OrderDetail;
import DAL.User;
import DAL.UserDAL;
import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class OrderBLL {
    private ArrayList<Order> orderList = new ArrayList<>();
    private OrderDAL orderDAL = new OrderDAL();

    public OrderBLL() {

    }

    public ArrayList<Order> getAllOrders(){
        orderList = new ArrayList(orderDAL.getAllOrders());
        return orderList;
    }
    
    public Order getOrderById(int id){
        Order order = orderDAL.getOrderById(id);
        return order;
    }

    public boolean saveOrder(Order order){
        return orderDAL.saveOrder(order);
    }

   public boolean updateOrder(Order order){
        return orderDAL.updateOrder(order);
    }
   public boolean deleteOrderByID(int id){
        return orderDAL.deleteOrderByID(id);
    }
    
    public ArrayList<Order> findOrderByUserName(String name){
        
        ArrayList<Order> result = new ArrayList<>();

        for (Order o : orderList) {
            if (o.getUser().getFirstName().toLowerCase().contains(name.toLowerCase())) {
                result.add(o);
            }
        }
        return result;

    }
    
     public ArrayList<OrderDetail> findOrderDetailByProductName(Order order, String name){
        
        ArrayList<OrderDetail> result = new ArrayList<>();

        for (OrderDetail od : order.getOrderDetails()) {
            if (od.getProduct().getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(od);
            }
        }
        return result;

    }

    public ArrayList<Order> ReadUserByNumPage(ArrayList<Order> orderList,int page, int numRecord){
       
        //onlList = this.readAllOnlineCourse();
        int startRecord = (page - 1) * numRecord;
        int endRecord = page * numRecord;

        return new ArrayList<Order>(orderList.subList(startRecord, Math.min(endRecord, orderList.size())));

    }
    
//    public static void main(String[] args) {
//        OrderBLL oBLL = new OrderBLL();
//        oBLL.deleteOrderByID(41);
//    }
    
}
