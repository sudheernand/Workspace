package com.indus.training.io.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentIO {

	public static void main(String[] args) {
		Console consoleObj = System.console();

		String msg = consoleObj.readLine("ENTER %n" + "1 To SELECT STUDENT REGISTRATION %n" + "2 to STUDENT INFO");

		BufferedReader inStream = null;
		BufferedWriter outStream = null;

		int a = Integer.parseInt(msg);
	

		if (a == 1) {
			File srcFile = new File("input.txt");
			try {
				srcFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {

				outStream = new BufferedWriter(new FileWriter(srcFile, true));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				String msg1 = consoleObj.readLine("Enter student ID");
				outStream.write(msg1);
				outStream.newLine();

				String msg2 = consoleObj.readLine("Enter student NAME");
				outStream.write(msg2);
				outStream.newLine();
				String msg3 = consoleObj.readLine("Enter student PLACE");
				outStream.write(msg3);
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

		} else if (a == 2) {

			int lineCount = 0;
			String stringArray[] = new String[30];
			String lineRead = null;

			try {
				inStream = new BufferedReader(new FileReader("input.txt"));
				while (lineCount < 30 && (lineRead = inStream.readLine()) != null) {
					stringArray[lineCount] = lineRead;
					lineCount++;

				}

				String msg7 = consoleObj.readLine("enter student id ");
				int c = Integer.parseInt(msg7);
				if (c == 1) {

					System.out.println(stringArray[0]);
					System.out.println(stringArray[1]);
					System.out.println(stringArray[2]);

				} else if (c == 2) {
					System.out.println(stringArray[3]);
					System.out.println(stringArray[4]);
					System.out.println(stringArray[5]);

				} else if (c == 3) {
					System.out.println(stringArray[6]);
					System.out.println(stringArray[7]);
					System.out.println(stringArray[8]);

				} else if (c == 4) {
					System.out.println(stringArray[9]);
					System.out.println(stringArray[10]);
					System.out.println(stringArray[11]);

				} else if (c == 5) {
					System.out.println(stringArray[12]);
					System.out.println(stringArray[13]);
					System.out.println(stringArray[14]);

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
}