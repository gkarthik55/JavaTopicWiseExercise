package com.java.learnings6.iostreamsjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaExample_44_BufferedIOStreams
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("file.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
        String s="Welcome to javaTpoint.";    
	    byte b[]=s.getBytes();    
	    bos.write(b);    
	    bos.flush();    
	    bos.close();    
	    fos.close();    
	    System.out.println("success");    
		
		FileInputStream fis = new FileInputStream("file.txt");
		BufferedInputStream bin = new BufferedInputStream(fis);    
        int i;    
        
        while((i=bin.read())!=-1)
        {    
         System.out.print((char)i);    
        }    
        bin.close();    
        fis.close();    
 
	}		
}	         
