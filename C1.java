package com.collections.demo;

import java.util.Scanner;

public class C1 {
	
	public void sort(String s[], int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	 
	        int j = i - 1;
	        
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        
	        s[j+1] = temp;
	        
	    }
	    
	    
	}
	public  void print(String str[], int n)
	{
	    for (int i=0; i<n; i++)
	        System.out.print(str[i]+" ");
	}

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String str= sc.nextLine(); 
		String[] arr = str.split(" ");
		int k=arr.length;
		
		
		     
		  C1 a1=new C1();
		  
		  a1.sort(arr,k);
		   
	     a1.print(arr, k);
	
	}

}

