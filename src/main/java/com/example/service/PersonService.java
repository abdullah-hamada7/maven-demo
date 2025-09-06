package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Abdullah");
		p.setLastName("Hamada");
		persons.add(p);

		Person p1 = new Person();
		p1.setId("2");
		p1.setAge(22);
		p1.setFirstName("Abdullah2");
		p1.setLastName("Hamada2");
		persons.add(p1);
		
		Person p2 = new Person();
		p2.setId("3");
		p2.setAge(23);
		p2.setFirstName("Abdullah3");
		p2.setLastName("Hamada3");
		persons.add(p2);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

