//Name: Pratham Yadav
//PRN: 2020BTEIT00006
//DATE: 19/03/22

import java.lang.*;
import java.lang.Math;
import java.util.*;

class MathOpr{
	
	public static int options(){
		
		System.out.println("Enter 1 for addition ");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication ");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 5 for square");
 		System.out.println("Enter 6 for square root");
		System.out.println("Enter 7 for Exit");
		System.out.println("Select Your Choice : ");
		Scanner s =new Scanner(System.in);
		int x = s.nextInt();
		return x;
	}
	public static void main(String arg[]){
		
		
		int x;
		double a=0,b=0,c=0;
		Scanner s =new Scanner(System.in);	
		
	do{	
		x=options();
		if(x!=7){
			System.out.println("Enter first number : ");
			a=s.nextDouble();
		}
		
		if(x<=4){
		  	System.out.println("Enter Second number : ");
			b=s.nextDouble();
		}
		switch(x){
			case 1:
				c = a+b;
				System.out.println(a+" + "+b+" = "+c);
				break ;

			case 2:
				c = a-b;
				System.out.println(a+" - "+b+" = "+c);
				break ;

			case 3:
				c = a*b;
				System.out.println(a+" * "+b+" = "+c);
				break ;

			case 4:
				c = a/b;
				System.out.println(a+" / "+b+" = "+c);
				break ;

			case 5:
				c = a*a;
				System.out.println(a+" * "+a+" = "+c);
				break ;

			case 6:
				c = Math.sqrt(a);
				System.out.println("square_root(" +a+ ") = "+c);
				break;

			case 7:
				System.out.println("Program Ended");
				break;		
		}

	   }while(x!=7);
	}
}