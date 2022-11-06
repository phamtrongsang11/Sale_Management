/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Order;
import DAL.OrderDAL;
import DAL.OrderDetail;
import DAL.OrderDetailDAL;
import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class OrderDetailBLL {
    private OrderDetailDAL odDAL = new OrderDetailDAL();

    public OrderDetailBLL() {

    }

    public boolean saveOrder(OrderDetail od){
        return odDAL.saveOrderDetail(od);
    }

   public boolean updateOrder(OrderDetail od){
        return odDAL.updateOrderDetail(od);
    }
   public boolean deleteOrderByID(int id){
        return odDAL.deleteOrderDetailById(id);
    }
    

    public ArrayList<OrderDetail> ReadOrderDetailByNumPage(ArrayList<OrderDetail> odList,int page, int numRecord){
       
        //onlList = this.readAllOnlineCourse();
        int startRecord = (page - 1) * numRecord;
        int endRecord = page * numRecord;

        return new ArrayList<OrderDetail>(odList.subList(startRecord, Math.min(endRecord, odList.size())));

    }
}
