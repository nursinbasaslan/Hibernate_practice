package com.hb_prc04.onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {
	public static void main(String[] args) {

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Appointment.class)
				.addAnnotatedClass(Patient.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
	
		
		//1- 1001 id li patient in get methodu kullanarak appointmentlerini yazdirin

		
		//2- SQL query hasta ve randevu bilgilerini getirelim

		
		//3- hql query hasta ve randevu bilgilerini getirelim
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
