package com.hb_prc01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {
	
		Doctor01 dr10=new Doctor01();
		Doctor01 dr20=new Doctor01();
		Doctor01 dr30=new Doctor01();
		Doctor01 dr40=new Doctor01();
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Doctor01.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		dr10=session.get(Doctor01.class, 1001);
		dr20=session.get(Doctor01.class, 1002);
		dr30=session.get(Doctor01.class, 1003);
		dr40=session.get(Doctor01.class, 1004);
		
		
		System.out.println(dr10);
		System.out.println(dr20);
		System.out.println(dr30);
		System.out.println(dr40);
		
		
		//sql ve hql sorgulari ile tbl_doctor table indan verileri getiren sorgulari yaziniz
		//doctor class ina education table i embbed ediniz
		//onetoone iliskisi kuracak class create ediniuz
		
		
		
		
		tx.commit();
		session.close();
		sf.close();

	}

}
