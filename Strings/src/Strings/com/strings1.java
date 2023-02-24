package Strings.com;

import java.util.Arrays;

import java.util.Scanner;

public class strings1 {
	public static void main(String[] args) {
		
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter Your String:");
		 * String name= sc.nextLine();
		 */
		 
		//System.out.println("Enter Your String1:");
		//String name1= sc.nextLine();
		/*
		 * System.out.println(" after triming:"+name.trim().length());
		 * System.out.println("After triming character length:"+name.length());
		 * System.out.println(name.startsWith("j"));
		 * System.out.println(name.toLowerCase());
		 * System.out.println(name.toUpperCase());
		 * 
		 */
		/*
		 * if(name.startsWith("s")) {
		 * System.out.println("Yes, it is true started with j");
		 * 
		 * }else { System.out.println("No, it not started with j"); }
		 */
		
		  String s="hi java wellcome to the programming";
		  //String sc1="java"; 
		  //System.out.println(s);
		  //System.out.println(sc1);
		 
		
		//char[] a= s.toCharArray();
		//System.out.println(name.lastIndexOf("i"));
		System.out.println(Arrays.toString(s.split(" ")));
		System.out.println(s.charAt(6));
		System.out.println(s.replaceFirst("hi", "hellos"));
		//System.out.println(name.lastIndexOf("i"));
		//System.out.println(name.toCharArray());
		//System.out.println(name.equalsIgnoreCase(name1));
		
		
	}

}
