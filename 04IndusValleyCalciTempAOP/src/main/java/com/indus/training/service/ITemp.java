package com.indus.training.service;

import com.indus.training.domain.TempIn;
import com.indus.training.domain.TempOut;

public interface ITemp {
	
	public TempOut cToF(TempIn tempInObj);
	
	public TempOut fToC(TempIn tempInObj);

}
