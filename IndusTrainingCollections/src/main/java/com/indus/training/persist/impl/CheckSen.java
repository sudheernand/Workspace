package com.indus.training.persist.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CheckSen extends AbsClass {

	public static void main(String[] args) {
		Sentence sen = new Sentence();
		System.out.println(sen.method("hey bye hey bye see see see f f f f f f g gg g gg g gg g g g  "));

	}

	@Override
	void fart() {

	}

}

class Sentence {
	public String method(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");
		ArrayList<String> al = new ArrayList<String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		while (st.hasMoreTokens()) {
			String n = st.nextToken();
			al.add(n);
		}

		for (int i = 0; i < al.size(); i++) {
			int b = 0;
			for (int j = 0; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					b++;
				}

			}

			hm.put(b, al.get(i));
		}
		Map<Integer, String> tm = new TreeMap<Integer, String>(hm);
		System.out.println(tm);
//		 for (Integer keys : tm.keySet()) {
//			 System.out.println(keys);
//		
//		 }
		Object[] keys = tm.keySet().toArray();
		Integer seckey = (Integer) keys[keys.length - 2];
		return tm.get(seckey);

	}

}