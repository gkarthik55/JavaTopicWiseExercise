package com.java.learnings6.iostreamsjava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaExample_43_FileAndDataIOStreams
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("file.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Writing the Text to the File");
		fos.close();
		
		FileInputStream fis = new FileInputStream("file.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		String str = dis.readUTF();
        System.out.println(str); 
        fis.close();      
 

	}		
}	         
