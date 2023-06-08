import java.util.Scanner;

public class UsingThrow 
{
	 //function to check if person is eligible to vote or not   
   
	public static void validate() 
	{    
		int age; 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your age: ");
    	age=Integer.parseInt(sc.nextLine());
        if(age<18)
        {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
	}  
    public static void main(String args[]){   
        validate();  
        System.out.println("voting system");    
  }    
	  
}