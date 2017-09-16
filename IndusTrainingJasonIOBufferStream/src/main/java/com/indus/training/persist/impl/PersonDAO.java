package com.indus.training.persist.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import com.indus.training.persist.IPersonDAO;
import com.indus.training.persist.entity.Person;

public class PersonDAO implements IPersonDAO {
	public boolean create(Person pObj) {
		boolean result = false;

		String id = pObj.getId();

		BufferedWriter outStream = null;

		File srcFile = new File(id);
		if (srcFile.exists()) {
			System.out.println("file alrady exists");
			System.exit(0);
		} else {

			try {
				srcFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				outStream = new BufferedWriter(new FileWriter(srcFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {

				pObj.getFirstname();
				pObj.getLastname();
				pObj.getMiddlename();
				pObj.getId();

				outStream.write(pObj.toString());
				// outStream.write(pObj.getFirstname());
				// outStream.newLine();
				// outStream.write(pObj.getLastname());
				// outStream.newLine();
				// outStream.write(pObj.getMiddlename());
				// outStream.newLine();

				result = true;
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

		return result;

	}

	public boolean find(Person pObj) {

		int lineCount = 0;
		String stringArray[] = new String[30];
		String lineRead = null;
		String id = pObj.getId();

		BufferedReader inStream = null;
		try {
			inStream = new BufferedReader(new FileReader(id));
			while (lineCount < 30 && (lineRead = inStream.readLine()) != null) {
				stringArray[lineCount] = lineRead;
				lineCount++;

			}
			String example = stringArray[0];
			StringTokenizer stk = new StringTokenizer(example, ",");
			String sf = stk.nextToken();
			String sm = stk.nextToken();
			String sl = stk.nextToken();
			String sid = stk.nextToken();
			StringTokenizer stkf = new StringTokenizer(sf, ":");
			String sFirst = stkf.nextToken();
			String sfirst = stkf.nextToken();
			StringTokenizer stkm = new StringTokenizer(sm, ":");
			String sMid = stkm.nextToken();
			String smid = stkm.nextToken();
			StringTokenizer stkl = new StringTokenizer(sl, ":");
			String sLast = stkl.nextToken();
			String slast = stkl.nextToken();
			System.out.println(sfirst);
			// System.out.println(smid);
			// System.out.println(slast);

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
		}

		return true;

	}

	public boolean delete(Person pObj) {

		String id = pObj.getId();
		File srcFile = new File(id);
		if (srcFile.exists()) {
			srcFile.delete();
		} else {
			System.out.println("file does not exist");
		}

		return true;

	}

	public boolean update(Person pObj) {
		String id = pObj.getId();

		BufferedWriter outStream = null;

		File srcFile = new File(id);

		if (srcFile.exists()) {
			try {
				srcFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				outStream = new BufferedWriter(new FileWriter(srcFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				outStream.write(pObj.getFirstname());
				outStream.newLine();
				outStream.write(pObj.getMiddlename());
				outStream.newLine();
				outStream.write(pObj.getLastname());
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

		} else {

			System.out.println("file does not exists");
			System.exit(0);
		}

		return true;

	}
}
