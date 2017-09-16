package com.indus.training.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRegistrationDetails {
	public void readFromConsolWriteToFile(String input) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("enter student first name");
		String f = userIn.next();
		System.out.println("enter student middle name");
		String m = userIn.next();
		System.out.println("enter student last name");
		String l = userIn.next();
		BufferedReader inStream = null;
		BufferedWriter outStream = null;
		File srcFile = new File(input);
		try {
			srcFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			outStream = new BufferedWriter(new FileWriter(srcFile, true));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			outStream.write(f);
			outStream.newLine();
			outStream.write(m);
			outStream.newLine();
			outStream.write(l);
			outStream.newLine();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
