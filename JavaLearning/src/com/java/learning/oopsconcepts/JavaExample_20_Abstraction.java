package com.java.learning.oopsconcepts;

abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) 
    { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() 
    { 
        return color; 
    } 
} 

class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) 
    { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    // Area of a Circle = Pi * R * R
    double area() 
    { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color + "and area is : " + area(); 
    } 
      
} 
class Rectangle extends Shape
{ 
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) 
    { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    // Area of a Rectangle = Length * Breadth 
    double area() 
    { 
        return length*width; 
    } 
  
    @Override
    public String toString() 
    { 
        return "Rectangle color is " + super.color + "and area is : " + area(); 
    } 
  
} 

public class JavaExample_20_Abstraction 
{
	//	Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators 
	//	will increase the speed of car or applying brakes will stop the car but he does not know about how on 
	//	pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism 
	//	of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is.
	
	// In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
	
	public static void main(String[] args) 
	{
     	Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
	}
}
