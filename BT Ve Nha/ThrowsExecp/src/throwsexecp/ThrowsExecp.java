/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwsexecp;

class ThrowsExecp 
{ 
	static void fun() throws IllegalAccessException 
	{ 
		System.out.println("Inside fun(). "); 
		throw new IllegalAccessException("demo"); 
	} 
	public static void main(String args[]) 
	{ 
		try
		{ 
			fun(); 
		} 
		catch(IllegalAccessException e) 
		{ 
			System.out.println("caught in main."); 
		} 
	} 
} 

