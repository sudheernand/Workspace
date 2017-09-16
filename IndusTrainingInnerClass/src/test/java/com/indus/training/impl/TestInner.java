package com.indus.training.impl;

import com.indus.training.service.Lock;
import com.indus.training.service.Lock.Key;

public class TestInner {
	public static void main(String[] args) {
		Lock lockObj = new Lock("LockName");
		System.out.println(lockObj);
		Lock.Key keyObj = lockObj.getLockKey("keyname");
		Lock.Key keyObj4 = lockObj.getLockKey("sdsdsd");
		//Lock.Key keyObj2 = lockObj.new Key("Lock Key");
		//Lock.GblKey glKeyObj = new Lock.GblKey();
		System.out.println(keyObj);
		System.out.println(keyObj4);

	}

}
