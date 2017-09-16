package com.indus.training.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public void readFromSourceWriteToDest(String srcFile, String destFile ) 
	{
//		File fileInput = new File(srcFile);
//		File fileOutput = new File(destFile);
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {
			inStream = new FileInputStream(srcFile);
			outStream =new FileOutputStream(destFile);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
			int byteStream = 0;
			try {
				while((byteStream = inStream.read())!= -1){
					outStream.write(byteStream);
					System.out.println(byteStream);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				if (  inStream != null){
					try {
						inStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					if (outStream!= null)
					{try {
						outStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		
		
		
	}

}
}
