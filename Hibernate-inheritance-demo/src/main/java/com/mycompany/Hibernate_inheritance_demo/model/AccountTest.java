package com.mycompany.Hibernate_inheritance_demo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class)
					.addAnnotatedClass(CurrentAccount.class)
					.addAnnotatedClass(SavingsAccount.class).buildSessionFactory();
			Session session = factory.openSession();
			Account ac = new Account("Kavya S Amin",1234567898765l,"KARB000543");
			CurrentAccount cac = new CurrentAccount("Kavya S Amin", 1234567898765l,"KARB000543", 20000l, 30000l);
			SavingsAccount sac = new SavingsAccount("Kavya S Amin", 1234567898765l,"KARB000543", 20000l, 15000l);
		session.getTransaction().begin();
			session.save(ac);
			session.save(cac);
			session.save(sac);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}