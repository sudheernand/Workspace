package com.indus.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharecterIO {
	public void readWriteCharStream(String src, String dest) {
		// File srcFile = new File(src);
		// File destFile = new File(dest);
		BufferedWriter outStream = null;
		BufferedReader inStream = null;

		try {
			outStream = new BufferedWriter(new FileWriter(dest));
			inStream = new BufferedReader(new FileReader(src));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String charStream = null;
		try {
			while ((charStream = inStream.readLine()) != null) {
				outStream.newLine();
				outStream.write(charStream);
				System.out.println(charStream);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outStream != null) {
				try {
					outStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

}