package com.indus.training.domain
;

public class TestNameNew {

	public static void main(String[] args) {
 NameNew nObj = new NameNew();
 cocncatNew cObj =new cocncatNew();
 nObj.first = "sudheer";
 nObj.last = "renukunta";
 cObj.concatenation(nObj);
 System.out.println("Full nme is " + nObj.fullName);}

}
