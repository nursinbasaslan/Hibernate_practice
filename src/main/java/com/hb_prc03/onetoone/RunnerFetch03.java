package com.hb_prc03.onetoone;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerFetch03 {

	public static void main(String[] args) {

		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Doctor03.class).addAnnotatedClass(Stethoscope.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// 1) id 1001 olan dr u fetch ediniz get methodu kullanarak
		

		
		//2) id 101 olan stettoskpu fetch ediniz get methodu kullanarak
	
		

		
		//3) steteskoplu dr lari getiren hql sorgusu yaziniz
		

		
		//4) steteskoplu dr lari getiren sql sorgusu yaziniz

		
		//5) Fetch doctor name, stet name and doctor grade of records from Doctor table

		
		//hql ile

		
		//6) fetch doctor name, stet name and doctor grade of records from Stethoscope table

		
		
		//hql ile

		
		
		//7) Fetch doctor name, stet name and dr grade of all records from Doctor03 and Stethoscope table

		
		//hql ile

		

        //8) Fetch all doctors information of common records from doctor and stethoscope table

		
		//hql ile

		
		
		 //9) Fetch all doctors information of all records from Doctor03 and Stethoscope table
		//hql ile

		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();

	}

}
