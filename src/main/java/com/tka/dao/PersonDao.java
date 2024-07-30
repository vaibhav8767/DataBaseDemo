package com.tka.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DataBaseDemo.entity.Person;

import jakarta.websocket.Session;
@Repository // this is most imp to to access the person dao (Server)
public class PersonDao {
	private static final Person Person = null;
	@Autowired // session all come from autowire
SessionFactory  factory;

	public String insertData(Person p) {
org.hibernate.Session session=	 factory.openSession();
session.beginTransaction();
session.persist(p);//save the data of person
session.getTransaction().commit();
session.close();
return "Record is saved";

	}
	public String updateData(int id,Person p) {
		org.hibernate.Session session=	 factory.openSession();
		session.beginTransaction();
Person dbRecord=	session.get(Person.class,id);
	dbRecord.setEmailid(p.getEmailid());
	dbRecord.setFname(p.getFname());
	dbRecord.setMobileno(p.getMobileno());
	dbRecord.setAdharno(p.getAdharno());
	dbRecord.setPassword(p.getPassword());
	session.merge(dbRecord);
	session.getTransaction().commit();
	session.close();
	return "Data is Updated....";
}
	public Person getparticularRecord(int id ) {
		org.hibernate.Session session=	 factory.openSession();
		session.beginTransaction();
		String hqlQuery=" from Person where id=:myid";   //Step 1 
	Query<Person> query=	session.createQuery(hqlQuery,Person.class);  //Step 2 
		query.setParameter("myid",id);  //Step 3
	Person p=	query.uniqueResult();    //Step 4
	session.getTransaction().commit();
	session.close();
	return p;
	}
	public List getAllRecord() {
		org.hibernate.Session session=	 factory.openSession();
		session.beginTransaction();
		String hqlQuery="from Person ";
	Query<Person> query=	session.createQuery(hqlQuery,Person.class);
List<Person> list =	query.list();
	session.getTransaction().commit();
	session.close();
	return list;
	}
	
	
	
}