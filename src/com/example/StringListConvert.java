package com.example;

import java.util.Arrays;
import java.util.List;

public class StringListConvert {
	public static void main(String[] args) {
		String str = "[1,501,634]";
		System.out.println("str : "+str);
		String array[] = str.replace("[", "").replace ("]", "").split (",");
		List<?> list= Arrays.asList(array);
		System.out.println("list :"+list);
		
		String strData = str.replaceAll("\\[|\\]", "").replaceAll(", ",",");
		System.out.println("strData : "+strData);
		String[] strArray = strData.split(",");
		String stringArrLst = Arrays.toString(strArray);
		
		System.out.println("stringArrLst : "+stringArrLst);
		
		String array1[] = str.replaceAll("\\[|\\]", "").replaceAll(", ",",").split (",");
		List<?> list1= Arrays.asList(array1);
		System.out.println("list1 :"+list1);
	}

}
