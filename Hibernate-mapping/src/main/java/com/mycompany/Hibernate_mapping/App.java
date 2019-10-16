package com.mycompany.Hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.Hibernate_mapping.model.Instructor;
import com.mycompany.Hibernate_mapping.model.InstructorDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
 		addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
     	   Session session=factory.getCurrentSession();
          InstructorDetails d = new InstructorDetails();
          d.setYoutubeChannel("http://youtube.com/redhat");
          d.setTwitter("http://twitter.com/hat_is_red");
          Instructor i = new Instructor();
          i.setFirstName("Nila");
          i.setLastName("Bhat");
          i.setEmail("nila@gmail.com");
          i.setInstructorDetailId(d);
          session.getTransaction().begin();
          session.persist(d);
          session.persist(i);
          session.getTransaction().commit();
          session.close();
    }
}
