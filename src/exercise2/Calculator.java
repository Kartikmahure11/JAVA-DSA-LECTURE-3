package exercise2;

import java.util.Scanner;

class Calculator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number one :");
		int n1=sc.nextInt();
		System.out.print("Enter the Number two :");
		int n2=sc.nextInt();
		
		 
	     System.out.println("1: Addition (+)");
	     System.out.println("2: Subtraction (-)");
         System.out.println("3: Multiplication (*)");
         System.out.println("4: Division (/)");
         System.out.println("5: Modulo (%)");
         System.out.print("Choose operation:");
         int choice = sc.nextInt();
         int result=0;
         
         if(choice == 1)
         {
        	 result=n1+n2;
        	 System.out.println(result);
         }
         else if(choice==2)
         {
        	 result=n1-n2;
        	 System.out.println(result);
         }
         else if(choice==3)
         {
        	 result=n1*n2;
        	 System.out.println(result);
         }
         else if(choice==4)
         {
        	 if(n2!=0)
        	 {
        		 result=n1/n2;
        		 System.out.println(result);
        	 }
        	 else
        	 {
        		 System.out.println("Cannot Divide By Zero");
        	 }
         }
         else if(choice==5)
         {
        	 if(n2!=0)
        	 {
        		 result=n1%n2;
        		 System.out.println(result);
        		 
        	 }
        	 else
        	 {
        		 System.out.println("Module Cannot be perform Zero");
        	 }
         }
		
	 
	}

}
