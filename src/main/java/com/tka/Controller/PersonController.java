package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DataBaseDemo.entity.Person;
import com.tka.service.PersonService;

@RestController

public class PersonController {
	@Autowired
	PersonService service;

	@PostMapping("/save")
	public String saveRecord(@RequestBody Person p) {
		String msg = service.InsertData(p);
		return msg;
	
	}	
@PutMapping("/updatedata/{id}")
public String UpdateRecord(@PathVariable int id,@RequestBody Person p){
  String msg= service.updatedata(id,p);
  return msg; 
}
@GetMapping("/getparticulardata/{id}")
public Person getparticularRecordById(@PathVariable int id ) {
Person p =	service.getparticularRecord(id);
         return p;
}
@GetMapping("/getall")
public List<Person> getAllRecord(){
List<Person> list=	service.getAllRecord();	
return list;
}


}




