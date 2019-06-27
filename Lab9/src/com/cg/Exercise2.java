package com.cg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	public static void main(String args[])
	{
		String s=null;
		System.out.println("Enter any String/Character Array");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			s=br.readLine().toLowerCase();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		char c[]=s.toCharArray();
		Map<Character,Integer> m=new HashMap<>();
		m=countCharacter(c);
		System.out.println(m);
	
	}

	public static Map countCharacter(char c[]) {
		// TODO Auto-generated method stub
		Map<Character,Integer> m=new HashMap<>();
		int i=0;
		while(i<c.length)
		{
			if(m.containsKey(c[i]))
				m.put(c[i], m.get(c[i])+1);
			else
				m.put(c[i], 1);
			
			i++;
		}
		return m;
	}
	
}
