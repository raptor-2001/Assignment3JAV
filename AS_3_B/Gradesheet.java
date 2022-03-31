//Name: Pratham Yadav
//PRN: 2020BTEIT00006
//DATE: 19/03/22

import java.lang.*;
import java.util.*;

class Gradesheet{

	public static void subjectName(int x){
		if(x==0){
			System.out.print("English Marks : ");
		}else if(x==1){
			System.out.print("Physics Marks : ");
		}else if(x==2){
			System.out.print("Maths Marks : ");
		}else if(x==3){
			System.out.print("Chemistry Marks : ");
		}else{
			System.out.print("Biology Marks : ");
		}

		return ;
	}

	public static char tell_grade(double p){
		if(p<35){
			return 'F';
		}else if(p>=35 && p<65){
			return 'D';
		}else if(p>=65 && p<80){
			return 'C';
		}else if(p>=80 && p<90){
			return 'B';
		}else if(p>=90){
			return 'A';
		}
		return 'F';

	}
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		String collegeName;
		String studentName;
		int rollNo;
		String gender;
		int marks[]=new int[5];
		int total=0;
		double percentage;
		char grade;

		System.out.print("Enter College Name : ");
		collegeName = s.nextLine();
		
		System.out.print("Enter Student Name : ");
		studentName = s.nextLine();

		System.out.print("Enter Roll No. : ");
		rollNo = s.nextInt();
		
		System.out.println("***Enter Marks out of 100***");
		for(int i=0; i<5; i++){
			subjectName(i);
			marks[i]=s.nextInt();
			total+=marks[i];
		}

		percentage = (double) (total/5);
		
		grade = tell_grade(percentage);
		

		System.out.println("*******Student information*******");
		System.out.println("College Name : " + collegeName);
		System.out.println("Student Name : " + studentName);
		System.out.println("Roll No. : " + rollNo);
		for(int i=0;i<5;i++){
			subjectName(i);
			System.out.print(marks[i] + "\n");
		}
		
		System.out.println("Total marks out of 500 : " + total);
		System.out.println("Percentage Scored : "+percentage+"%");
		if(grade=='F'){
			System.out.println("Fail");
		}else{
			System.out.println("Grade : " + grade);
		}
		
		
	}
}