package com.indus.training.impl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.indus.training.persons.Persons;


public class MarshPersons {

	public static void main(String[] args) throws JAXBException {

		JAXBContext jaxbObj = JAXBContext.newInstance(Persons.class);
		Unmarshaller unmarshObj = jaxbObj.createUnmarshaller();

		Persons personObj = (Persons) unmarshObj.unmarshal(new File("PersonCollection.xml"));
		System.out.println(personObj);

	}

}
