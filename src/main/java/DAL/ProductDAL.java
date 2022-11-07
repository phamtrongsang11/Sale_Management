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
public class ProductDAL {

    private SessionFactory factory = HibernateUtils.getSessionFactory();

    public List<Product> getAllProducts() {
        Session session = null;
        Transaction transaction = null;
        List<Product> products = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            products = session.createQuery("from Product").list();
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

        return products;
    }

    public Product getProductById(int id) {
        Session session = null;
        Transaction transaction = null;
        Product product = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            product = session.get(Product.class, id);
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

        return product;
    }

    public boolean saveProduct(Product product) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(product);
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

    public boolean updateProduct(Product product) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(product);
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

    public boolean deleteProductById(int id) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Product product = session.get(Product.class, id);

            if (product != null) {
                product.getOrderDetails().clear();
                System.out.println(product.getOrderDetails().size());
                session.delete(product);
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
        ProductDAL pDAL = new ProductDAL();
        ProductDAL catDAL = new ProductDAL();

        CategoryDAL cateDAL = new CategoryDAL();
        Category cate = cateDAL.getCategoryById(7);

        Product p = new Product("Gong kình tròn nữ EyeCenter K22", 30, 150000, "...", cate);
        pDAL.saveProduct(p);
//        pDAL.deleteProductById(13);

        List<Product> products = pDAL.getAllProducts();
        for (Iterator iterator = products.iterator(); iterator.hasNext();) {
            Product prod = (Product) iterator.next();
            System.out.println("Name: " + prod.getName());
            System.out.println("Stock: " + prod.getStock());
            System.out.println("Price: " + prod.getStock());
            System.out.println("Cate: " + prod.getCategory());

        }
//        Product p = pDAL.getProductById(7);
//        System.out.println(p);
    }
}
