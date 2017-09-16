package com.indus.training.persist.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

import com.indus.training.persist.entity.PersonDetails;

public class PersonsDAO {
	public boolean create(PersonDetails pObj) {
		boolean result = false;

		String id = pObj.getId();

		ObjectOutputStream outStream = null;

		File srcFile = new File(id + ".txt");
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
				outStream = new ObjectOutputStream(new FileOutputStream(srcFile));
				outStream.writeObject(pObj);
				result = true;
			} catch (IOException e) {
				e.printStackTrace();
			}

			//
			// pObj.getFirstname();
			// pObj.getLastname();
			// pObj.getMiddlename();
			// pObj.getId();
			//
			// //outStream.write(pObj.toString());
			// // outStream.write(pObj.getFirstname());
			// // outStream.newLine();
			// // outStream.write(pObj.getLastname());
			// // outStream.newLine();
			// // outStream.write(pObj.getMiddlename());
			// // outStream.newLine();

			finally {
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

	public boolean find(String id) {

		// String id = pObj.getId();

		ObjectInputStream inStream = null;
		try {
			inStream = new ObjectInputStream(new FileInputStream(id + ".txt"));

			PersonDetails personObj = (PersonDetails) inStream.readObject();
			System.out.println(personObj);
		} catch (

		IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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

	public boolean delete(String param) {

		String id = param;
		File srcFile = new File(id+".txt");
		if (srcFile.exists()) {
			srcFile.delete();
		} else {
			System.out.println("file does not exist");
		}

		return true;

	}

	public boolean update(PersonDetails pObj) {
		String id = pObj.getId();

		ObjectOutputStream outStream = null;

		File srcFile = new File(id+".txt");

		if (srcFile.exists()) {
			try {

				srcFile.createNewFile();

				outStream = new ObjectOutputStream(new FileOutputStream(srcFile));
				outStream.writeObject(pObj);
			
			} catch (

			IOException e) {
				e.printStackTrace();
			}

			finally {
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
