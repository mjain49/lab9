package com.cg;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Exercise1 {
	public static void  main(String args[]) throws IOException
	{
		Map<String, Integer> map= new HashMap<String,Integer>();
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>(map.values());
		list=getValues(map);
		
		for(Integer o: list)
		 {
			 System.out.println(o);
		 }
	}

	private static ArrayList<Integer> getValues(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		map.put("A",5);
		map.put("B",9);
		map.put("C",1);
		ArrayList<Integer> list=new ArrayList<Integer>(map.values());
		Collections.sort(list);
		return list;
	}


}
