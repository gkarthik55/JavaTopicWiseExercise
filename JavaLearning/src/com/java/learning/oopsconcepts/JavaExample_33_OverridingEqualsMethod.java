package com.java.learning.oopsconcepts;

class Person 
{ 
    private double height, weight; 
  
    public Person(double ht, double wt) 
    { 
        this.height = ht; 
        this.weight = wt; 
    } 
  
    // Overriding equals() method
    @Override
    public boolean equals(Object obj) 
    { 
        // If the object is compared with itself then return true   
        if (obj == this) 
        { 
            return true; 
        } 
  
        /* Check if obj is an instance of Person or not "null instanceof [type]" also returns false */
        if (!(obj instanceof Person)) 
        { 
            return false; 
        } 
          
        // typecast obj to Person so that we can compare data members  
        Person person = (Person) obj;
        
        // Compare the data members and return accordingly  
        if (Double.compare(this.height, person.height) == 0 && Double.compare(this.weight, person.weight) == 0)
        {
        	return true;
        }
        else 
        {
        	return false;
        }
    } 
    
    @Override
    public String toString()
    {
    	return "Person Details: Height is "+ this.height + "Weight is " + this.weight;
    }
} 
  

public class JavaExample_33_OverridingEqualsMethod 
{
	public static void main(String[] args) 
	{
		Person P1 = new Person(175.00, 70.25);
		Person P2 = new Person(175.00, 70.25);
		
		if(P1.equals(P2))
		{
			System.out.println("Both the Person's are Same");
			System.out.println(P1);
		}
		else 
		{
			System.out.println("Both the Person's are not Same");
		}
	}
}
