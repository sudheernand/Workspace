package com.indus.training.service;

import java.io.Console;

public class CalcConsole {

	public static void main(String[] args) {
		Console consoleObj = System.console();
		String msg = consoleObj.readLine("enter 1 to select operation %n" + "2 to exit");
		int a = Integer.parseInt(msg);
		System.out.println("selected" + a);

		while (true) {

			if (a == 1) {
				String msg1 = consoleObj.readLine("1 for add %n" + "2 to sub %n" + "3 to exit");
				int b = Integer.parseInt(msg1);
				if (b == 1) {
					String msg2 = consoleObj.readLine("enter input 1 ");
					String msg3 = consoleObj.readLine("enter input 2");
					double in1 = Double.parseDouble(msg2);
					double in2 = Double.parseDouble(msg3);
					double result = in1 + in2;
					System.out.println("result " + result);

				} else if (b == 2)

				{
					String msg2 = consoleObj.readLine("enter input 1 ");
					String msg3 = consoleObj.readLine("enter input 2");
					double in1 = Double.parseDouble(msg2);
					double in2 = Double.parseDouble(msg3);
					double result = in1 - in2;
					System.out.println("result " + result);
				} else if (b == 3) {
					System.exit(0);

				} else {
					System.exit(0);
				}
			}

		}

	}

}
