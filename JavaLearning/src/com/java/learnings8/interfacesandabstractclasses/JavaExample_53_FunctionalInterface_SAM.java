package com.java.learnings8.interfacesandabstractclasses;

@FunctionalInterface  
interface Writeable
{  
    void writeSomething(String msg);  
}  

class FunctionalInterfaceExample implements Writeable
{  
    public void writeSomething(String msg)
    {  
        System.out.println(msg);  
    }  
}  

public class JavaExample_53_FunctionalInterface_SAM 
{
	public static void main(String[] args) 
	{
		FunctionalInterfaceExample obj = new FunctionalInterfaceExample();  
        obj.writeSomething("Learning about Functional Interface");  
	}
}
