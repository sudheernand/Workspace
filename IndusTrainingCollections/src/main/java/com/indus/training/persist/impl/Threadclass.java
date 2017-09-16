package com.indus.training.persist.impl;

public class Threadclass {
public static boolean con = false;
	public static void main(String[] args) throws InterruptedException {
		Thread tobj = new Thread(new Runnable() {

			public  void run() {
				con = true;
//				while (!con) {
//				
//				}
				for(int i = 0;i<100;i++){
					System.out.println(i);
				}
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("nothing");
			}
		});
		tobj.start();
		
	Thread.sleep(10000);
System.out.println("starting");
System.out.println(con);
	}

}
