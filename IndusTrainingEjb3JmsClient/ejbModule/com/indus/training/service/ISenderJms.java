package com.indus.training.service;

import javax.ejb.Remote;

@Remote
public interface ISenderJms {
	public void SenderJms(String id);

}
