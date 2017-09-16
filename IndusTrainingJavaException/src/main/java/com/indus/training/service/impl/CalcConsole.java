package com.indus.training.service.impl;

import java.io.Console;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;

public class CalcConsole {

	public static void main(String[] args) {
		Console consoleObj = System.console();
		System.out.println("__________________");
		String msg = consoleObj.readLine("ENTER %n" + "1 To SELECT operation %n" + "2 to ");
		System.out.println("__________________");
		int a = Integer.parseInt(msg);
		if (a == 2) {
			System.exit(0);

		}

		while (true) {
			Calculator calObj = new Calculator();

			if (a == 1) {
				System.out.println("__________________");
				String msg1 = consoleObj.readLine("1 TO ADD %n" + "2 TO SUB %n" + "3 TO EXIT");
				System.out.println("__________________");
				int b = Integer.parseInt(msg1);
				if (b == 1) {
					System.out.println("__________________");
					String msg2 = consoleObj.readLine("  ENTER INPUT 1 ");
					String msg3 = consoleObj.readLine("  ENTER INPUT 2 ");
					System.out.println("__________________");

					double in1 = Double.parseDouble(msg2);
					double in2 = Double.parseDouble(msg3);
					CalInput calInputObj = new CalInput();
					calInputObj.setInput1(in1);
					calInputObj.setInput2(in2);
					try {
						calObj.add(calInputObj);
					} catch (Exception e) {
						e.printStackTrace();
					}
					CalOutput calOutputObj = new CalOutput();
					try {
						calOutputObj = calObj.add(calInputObj);
					} catch (Exception e) {
						e.printStackTrace();
					}
					double result = calOutputObj.getResult();

					System.out.println("result " + result);

				} else if (b == 2)

				{
					System.out.println("__________________");
					String msg2 = consoleObj.readLine("ENTER INPUT1 ");
					String msg3 = consoleObj.readLine("ENTER INPUT2");
					System.out.println("__________________");
					double in1 = Double.parseDouble(msg2);
					double in2 = Double.parseDouble(msg3);
					CalInput calInputObj = new CalInput();
					calInputObj.setInput1(in1);
					calInputObj.setInput2(in2);
					try {
						calObj.add(calInputObj);
					} catch (Exception e) {
						e.printStackTrace();
					}
					CalOutput calOutputObj = new CalOutput();
					try {
						calOutputObj = calObj.sub(calInputObj);
					} catch (Exception e) {
						e.printStackTrace();
					}
					double result = calOutputObj.getResult();
					System.out.println("__________________");
					System.out.println("RESULT " + result);
					System.out.println("__________________");
				} else if (b == 3) {
					System.exit(0);

				} else {
					System.exit(0);
				}
			}

		}

	}

}
