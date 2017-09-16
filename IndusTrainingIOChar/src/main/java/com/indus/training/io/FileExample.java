package com.indus.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		
		BufferedReader br = null;
	
		try {

			
		 br	= new BufferedReader(new FileReader("InputFile"));
		 String line =null;
		 
		 int a = Integer.parseInt(line);
		 while((line=br.readLine())!=null){
			 System.out.println(line);
			 
		 }
		 
		 
		 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
