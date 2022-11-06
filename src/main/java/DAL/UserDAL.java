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
public class UserDAL {

    private SessionFactory factory = HibernateUtils.getSessionFactory();

    public List<User> getAllCustomer() {
        Session session = null;
        Transaction transaction = null;
        List<User> users = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            users = session.createQuery("FROM User Where IsEmployee = 0", User.class).list();

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
        return users;
    }
    
    public List<User> getAllEmployee() {
        Session session = null;
        Transaction transaction = null;
        List<User> users = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            users = session.createQuery("FROM User Where IsEmployee = 1", User.class).list();

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
        return users;
    }

    public User getUserById(int id) {
        Session session = null;
        Transaction transaction = null;
        User user = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            user = session.get(User.class, id);
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
        return user;
    }

    public boolean saveUser(User user) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(user);
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

    public boolean updateUser(User user) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
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

    public boolean deleteUserById(int id) {
        Session session = null;
        Transaction transaction = null;
        boolean result = true;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
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

        User user = new User("Tom", "Phill", "phill@gmail.com", "123", "0965433212",true);
//        User user = new User("Alice", "Jayson", "alice@gmail.com", "123", "0877653322");
        UserDAL uDAL = new UserDAL();
        uDAL.saveUser(user);
//        uDAL.deleteUserById(3);

//        List<User> users = uDAL.getAllUser();
//        
//        for (Iterator iterator = users.iterator(); iterator.hasNext();) {
//            User u = (User) iterator.next();
//            System.out.println("First Name: " + u.getFirstName());
//            System.out.println("Last Name: " + u.getLastName());
//            System.out.println("Email: " + u.getEmail());
//            
//        }
    }
}
