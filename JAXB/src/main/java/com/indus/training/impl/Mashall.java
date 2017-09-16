package com.indus.training.impl;

import java.io.File;
import java.util.List;

import javax.rmi.CORBA.StubDelegate;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.indus.training.xsd.person.Person;

public class Mashall {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbObj = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshObj = jaxbObj.createUnmarshaller();
//		List<Person> listObj = (List<Person>) unmarshObj.unmarshal(new File("sud.xml"));
//		System.out.println(listObj);

		 Person personObj = (Person) unmarshObj.unmarshal(new
		 File("sud.xml"));

		 System.out.println("person name " + personObj);
//		 Marshaller marshlObj = jaxbObj.createMarshaller();
//		 marshlObj.marshal(personObj, new File("personUnm.xml"));
//		 marshlObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
//		 Boolean.TRUE);
//		 marshlObj.marshal(personObj, System.out);
//		
	}
}
