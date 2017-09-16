package com.indus.training.service;

import com.indus.training.domain.TempInput;
import com.indus.training.domain.TempOutput;
import com.indus.training.exception.TemparatureException;

public interface ITemparature { 
	public TempOutput fahrenToCels(TempInput temInOb)throws TemparatureException;

}
