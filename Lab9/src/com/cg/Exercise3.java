package com.cg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String args[]) 
	{
		String a[]=null;
		int i=0;
		String k=null;
		System.out.println("Enter Numbers to find there Squares");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			k=br.readLine().trim();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		a=k.split(" ");
		int b[]=new int[a.length];
		while(i<b.length)
		{
			b[i]=Integer.parseInt(a[i]);
			i++;
		}
		Map<Integer,Integer> m=new HashMap<>();
		m=getSquares(b);
		System.out.println(m);

	}

	public static Map<Integer, Integer> getSquares(int[] b) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m=new HashMap<>();
		int i=0;
		while(i<b.length)
		{
			m.put(b[i], b[i]*b[i]);
			i++;
		}
		return m;
	}
}
