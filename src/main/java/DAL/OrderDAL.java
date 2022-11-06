/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author phamt
 */
public class OrderDAL {

    private SessionFactory factory = HibernateUtils.getSessionFactory();

    public List<Order> getAllOrders() {
        Session session = null;
        Transaction transaction = null;
        List<Order> orders = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            orders = session.createQuery("FROM Order", Order.class).list();

            transaction.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return orders;
    }

    public Order getOrderById(int id) {
        Session session = null;
        Transaction transaction = null;
        Order order = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            order = session.get(Order.class, id);
            transaction.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return order;
    }

    public boolean saveOrder(Order order) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(order);

            for (OrderDetail orderDetail : order.getOrderDetails()) {
                session.save(orderDetail);

                Product product = orderDetail.getProduct();
                int changeQty = product.getStock() - orderDetail.getQty();
                product.setStock(changeQty);

                session.update(product);
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

    public boolean updateOrder(Order order) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(order);
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

    public boolean deleteOrderByID(int id) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Order order = session.get(Order.class, id);
            if (order != null) {
                for (OrderDetail orderDetail : order.getOrderDetails()) {

                    Product product = orderDetail.getProduct();
                    int changeQty = product.getStock() + orderDetail.getQty();
                    product.setStock(changeQty);

                    product.getOrderDetails().remove(orderDetail);
                    
                    session.update(product);
                }

                order.getOrderDetails().clear();

                session.delete(order);
            }
            transaction.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
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

    public int getLastOrderId() {
        Session session = null;
        Transaction transaction = null;
        List<Order> orders = null;
        int i = 0;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            i = (Integer) session.createNativeQuery("SELECT OrderID FROM `purchase_order` ORDER BY OrderID DESC LIMIT 1").uniqueResult();

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return i;
    }

    public static void main(String[] args) {
        User u = new User();
        UserDAL uDAL = new UserDAL();
        User user = uDAL.getUserById(3);

        ProductDAL pDAL = new ProductDAL();
        Product product1 = pDAL.getProductById(13);
        System.out.println(product1);

        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf
                = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);

        OrderDAL oDAL = new OrderDAL();
        Order order = new Order();

        order.setDate(currentTime);
        order.setAddress("abc");
        order.setCity("Hanoi");
        order.setTotalQty(5);
        order.setTotalPrice(1000.0);
        order.setUser(user);

//        Product product2 = pDAL.getProductById(7);
//        OrderDetailID pk = new OrderDetailID();
//        pk.setOrderID(i);
//        pk.setProductID(2);
        OrderDetail od1 = new OrderDetail();
        od1.setOrder(order);
//        od1.setPrimaryKey(pk);
        od1.setProduct(product1);
        System.out.println(product1.getProductID());
//        od1.getPrimaryKey().setProductID(product1.getProductID());
        od1.setPrice(200.0);
        od1.setQty(5);
        od1.setSubtotal(1000.0);
        od1.setOrder(order);

//        order.addOrderDetails(od1);
//        oDAL.saveOrder(order);

        int id = oDAL.getLastOrderId();

        System.out.println(oDAL.deleteOrderByID(id));

//        OrderDetailDAL odDAL = new OrderDetaislDAL();
//        
//        odDAL.saveOrderDetail(od1);
//
//        for (OrderDetail orderDetail : order.getOrderDetails()) {
//            System.out.println(orderDetail.getOrder().getOrderID());
//            odDAL.saveOrderDetail(orderDetail);
//
//        }
    }
}
