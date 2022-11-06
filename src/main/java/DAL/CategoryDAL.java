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
public class CategoryDAL {

    private SessionFactory factory = HibernateUtils.getSessionFactory();

    public List<Category> getAllCategories() {
        Session session = null;
        Transaction transaction = null;
        List<Category> categories = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            categories = session.createQuery("FROM Category", Category.class).list();

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
        return categories;
    }

    public Category getCategoryById(int id) {
        Session session = null;
        Transaction transaction = null;
        Category category = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            category = session.get(Category.class, id);
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
        return category;
    }

    public boolean saveCategory(Category category) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();

        } catch (Exception ex) {

            result = false;
            ex.getMessage();
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

    public boolean updateCategory(Category category) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(category);
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

    public boolean deleteCategoryById(int id) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Category category = session.get(Category.class, id);
            if (category != null) {
                session.delete(category);
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
        CategoryDAL cateDAL = new CategoryDAL();
        Category cate = new Category("Gọng kính kim loại", "...");
        cateDAL.saveCategory(cate);

//        cateDAL.deleteCategoryById(3);
        List<Category> cates = cateDAL.getAllCategories();

        for (Iterator iterator = cates.iterator(); iterator.hasNext();) {
            Category c = (Category) iterator.next();
            System.out.println("Name: " + c.getName());
            System.out.println("Desc: " + c.getDescription());

        }

    }
}
