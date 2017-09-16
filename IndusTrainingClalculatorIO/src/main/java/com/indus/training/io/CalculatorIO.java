package com.indus.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CalculatorIO {
	public void readFromSrcWriteToDest(String src, String dest) {
		File srcFile = new File(src);
		File destFile = new File(dest);

		BufferedReader inStream = null;
		BufferedWriter outStream = null;

		try {
			inStream = new BufferedReader(new FileReader(srcFile));
			try {
				outStream = new BufferedWriter(new FileWriter(destFile));
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			int lineCount = 0;
			String stringArray[] = new String[3];
			String lineRead = null;

			while (lineCount < 3 && (lineRead = inStream.readLine()) != null) {
				stringArray[lineCount] = lineRead;
				lineCount++;
			}
			Double input1 = 0.0;
			Double input2 = 0.0;
			Double result = 0.0;
			String stringInput1 = null;
			String stringInput2 = null;
			String operation = null;
			String stringResult = null;
			input1 = Double.parseDouble(stringArray[0]);
			input2 = Double.parseDouble(stringArray[1]);
			operation = stringArray[2];
			if (operation.equalsIgnoreCase("add")) {
				result = input1 + input2;

			} else if (operation.equalsIgnoreCase("sub")) {
				result = input1 - input2;
			} else if (operation.equalsIgnoreCase("mul")) {
				result = input1 * input2;
			} else if (operation.equalsIgnoreCase("div")) {
				result = input1 / input2;
			} else {
				result = 0.0;
				operation = "invalid operation";

			}
			stringInput1 = String.valueOf(input1);
			stringInput2 = String.valueOf(input2);
			stringResult = String.valueOf(result);
			outStream.write(stringInput1);
			outStream.newLine();
			outStream.write(stringInput2);
			outStream.newLine();
			outStream.write(stringResult);
			outStream.newLine();
			outStream.write(operation);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					e.printStackTrace();

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
