package com.indus.training.service;

import com.indus.training.exception.JmsException;

public interface IJMSReciever {
	public boolean reciever() throws JmsException;

}
