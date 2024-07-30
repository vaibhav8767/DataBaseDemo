package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.DataBaseDemo.entity.Person;
import com.tka.dao.PersonDao;

@Service
public class PersonService {
@Autowired
PersonDao dao;
	public String InsertData(Person p){
     String vai=   dao.insertData(p);
	return vai;
		
		
	}
		
	public String updatedata(int id,Person p) {
		String msg = dao.updateData(id, p);
		return msg;
	      
	}
	
	
	public Person getparticularRecord(int id) {
	Person p=	dao.getparticularRecord(id);
	return p;
	}
	public List<Person> getAllRecord(){
	List<Person>  list=	dao.getAllRecord();
		return list;	
	}
	
	
}
