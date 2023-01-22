package com.ps.test.project.HibernateJPABeginner;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.hib.controller.FindUser_Hql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// FindUser_Hql u = new FindUser_Hql();
    	 //u.findUser();
    	// u.findUserSelect();
    //u.getRecordbyId();
    	 //u.getrecords();
    	 //u.getmaxSalary();
    	 //u.getmaxSalaryGroupBy();
    	// u.getNamedQueryExample();
    	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	   Session session = factory.openSession();
    	   TypedQuery<Object[]> queryy = session.createQuery( "SELECT U.salary, U.fullname FROM User AS U", Object[].class);
    	List<Object[]> resultss = queryy.getResultList();
    	for (Object[] a : resultss) {
    	   System.out.println("Salary: " + a[0] + ", FullName: " + a[1]); }

    }
    
}
