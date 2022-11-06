/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author phamt
 */
public class OrderDetailDAL {

    private SessionFactory factory = HibernateUtils.getSessionFactory();

//    public List<OrderDetail> getOrderDetailByIdOrder(int orderID) {
//        Session session = null;
//        Transaction transaction = null;
//        List<OrderDetail> orderDetails = null;
//        try {
//            session = factory.openSession();
//            transaction = session.beginTransaction();
//
//            String hql = "FROM Order_Detail WHERE OrderID = " + orderID;
////            orderDetails = session.createQuery(hql, OrderDetail.class).list();
//            orderDetails = session.createQuery("from OrderDetail").list();
//
//            transaction.commit();
//
//        } catch (Exception ex) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return orderDetails;
//    }
//
//    public List<OrderDetail> getOrderDetailById(int orderID, int productID) {
//        Session session = null;
//        Transaction transaction = null;
//        List<OrderDetail> orderDetail = null;
//        try {
//            session = factory.openSession();
//            transaction = session.beginTransaction();
//            String hql = "FROM Order_Detail WHERE OrderID = " + orderID + " AND ProductID = " + productID;
//            orderDetail = session.createQuery(hql, OrderDetail.class).list();
//            transaction.commit();
//        } catch (Exception ex) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return orderDetail;
//    }
    public boolean saveOrderDetail(OrderDetail orderDetail) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            session.save(orderDetail);
            System.out.println(orderDetail.getQty());
            transaction.commit();
        } catch (Exception ex) {
            result = false;
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    public boolean updateOrderDetail(OrderDetail orderDetail) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(orderDetail);
            transaction.commit();
        } catch (Exception ex) {
            result = false;
            System.out.println(ex.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    public boolean deleteOrderDetailById(int orderID) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            OrderDetail orderDetail = session.get(OrderDetail.class, orderID);
            if (orderDetail != null) {
                session.delete(orderDetail);
            }
            transaction.commit();
        } catch (Exception ex) {
            result = false;
            System.out.println(ex.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        OrderDetail od1 = new OrderDetail();
        od1.setPrice(200.0);
        od1.setQty(5);
//        od1.setOrder(order);
//        od1.setProduct(product1);
        od1.setSubtotal(1000.0);

        OrderDetailDAL odDAL = new OrderDetailDAL();

        odDAL.saveOrderDetail(od1);

//        for (OrderDetail orderDetail : order.getOrderDetails()) {
//            System.out.println(orderDetail.getOrder().getOrderID());
//            odDAL.saveOrderDetail(orderDetail);
//
//        }
//        List<OrderDetail> odList = odDAL.getOrderDetailByIdOrder(8);
//        for (Iterator iterator = odList.iterator(); iterator.hasNext();) {
//            OrderDetail od = (OrderDetail) iterator.next();
//            System.out.println("id: " + od.getOrder().getOrderID());
//            System.out.println("qty: " + od.getQty());
//            System.out.println("price: " + od.getPrice());
//
//        }
    }

}
