package com.java.learnings5.methodsinjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class JavaExample_42_Transiant implements Serializable 
{
	// Normal variables 
    int i = 10, j = 20; 
  
    // Transient variables 
    transient int k = 30; 
  
    // Use of transient has no impact here 
    transient static int l = 40; 
    transient final int m = 50; 
    
	public static void main(String[] args) throws Exception 
	{
		JavaExample_42_Transiant input = new JavaExample_42_Transiant(); 
		  
        // serialization 
        FileOutputStream fos = new FileOutputStream("test.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("test.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        
        JavaExample_42_Transiant output = (JavaExample_42_Transiant)ois.readObject(); 
        System.out.println("i = " + output.i); 
        System.out.println("j = " + output.j); 
        System.out.println("k = " + output.k); 
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m); 
	}		
}	         
