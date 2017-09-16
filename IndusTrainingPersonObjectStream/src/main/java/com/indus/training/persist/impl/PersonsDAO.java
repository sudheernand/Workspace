package com.indus.training.persist.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.indus.training.persist.entity.PersonDetails;
import com.indus.training.persist.exception.PersonDAOException;
import com.indus.training.persist.service.IPersonDAO;

public class PersonsDAO implements IPersonDAO {
	public boolean create(PersonDetails pObj) throws PersonDAOException {
		boolean result = false;
		if (pObj == null) {
			throw new PersonDAOException();
		}
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
				throw new PersonDAOException("IOexception", e);
				// e.printStackTrace();
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

	public boolean find(String param) throws PersonDAOException {
		boolean result = false;

		String id = param;
		File srcFile = new File(id + ".txt");
		if (!srcFile.exists()) {
			System.out.println("file  does not exists");

		} else {

			ObjectInputStream inStream = null;
			try {
				inStream = new ObjectInputStream(new FileInputStream(id + ".txt"));
				inStream.readObject();

				result = true;
				// PersonDetails personObj = (PersonDetails)
				// inStream.readObject();
				// System.out.println(personObj.toString());

				// StringTokenizer stk = new StringTokenizer(example, ",");
				// String sf = stk.nextToken();
				// String sm = stk.nextToken();
				// String sl = stk.nextToken();
				// String sid = stk.nextToken();
				// StringTokenizer stkf = new StringTokenizer(sf, ":");
				// String sFirst = stkf.nextToken();
				// String sfirst = stkf.nextToken();
				// StringTokenizer stkm = new StringTokenizer(sm, ":");
				// String sMid = stkm.nextToken();
				// String smid = stkm.nextToken();
				// StringTokenizer stkl = new StringTokenizer(sl, ":");
				// String sLast = stkl.nextToken();
				// String slast = stkl.nextToken();
				// System.out.println(sfirst);

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
		}

		return result;

	}

	public boolean delete(String param) throws PersonDAOException {
		boolean result = false;
		String id = param;
		File srcFile = new File(id + ".txt");
		if (srcFile.exists()) {
			srcFile.delete();
			result = true;
			System.out.println("delete success");
		} else {
			System.out.println("file does not exist");
		}

		return result;

	}

	public boolean update(PersonDetails pObj) throws PersonDAOException {
		boolean result = false;
		String id = pObj.getId();

		ObjectOutputStream outStream = null;

		File srcFile = new File(id + ".txt");

		try {

			srcFile.createNewFile();

			outStream = new ObjectOutputStream(new FileOutputStream(srcFile));
			outStream.writeObject(pObj);
			result = true;
			System.out.println("update success");

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

		return result;

	}
	// String id = pObj.getId();
	//
	// ObjectOutputStream outStream = null;
	//
	// File srcFile = new File(id + ".txt");
	//
	// if (srcFile.exists()) {
	// try {
	//
	// srcFile.createNewFile();
	// Scanner userIn = new Scanner(System.in);
	// System.out.println("enter student first name");
	// String f = userIn.next();
	// System.out.println("enter student middle name");
	// String m = userIn.next();
	// System.out.println("enter student last name");
	// String l = userIn.next();
	// pObj.setFirstname(f);
	// pObj.setLastname(l);
	// pObj.setMiddlename(m);
	// outStream = new ObjectOutputStream(new FileOutputStream(srcFile));
	// outStream.writeObject(pObj);
	//
	// } catch (
	//
	// IOException e) {
	// e.printStackTrace();
	// }
	//
	// finally {
	// if (outStream != null) {
	// try {
	// outStream.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// } else {
	//
	// System.out.println("file does not exists");
	// System.exit(0);
	// }
	//
	// return true;

}
