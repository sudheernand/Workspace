package com.indus.training.service;

import com.indus.training.entity.Contact;
import com.indus.training.exception.JndiException;

public interface IJndiService {
	public boolean bind(Contact id) throws JndiException;

	public boolean unbind(String id) throws Exception;

	public String lookup(String id) throws Exception;

	public boolean rebind(String id, String value) throws Exception;

}
