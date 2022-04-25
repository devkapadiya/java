package java_sem_4;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.out.println("1 for Addition:");
        System.out.println("2 for Substraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("Enter the option ");
        Scanner sc=new Scanner(System.in);
        int op,a,b;
        op=sc.nextInt();
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        if(op==1) {
        	System.out.println("Addition of given number is=>"+(a+b));
        }
        else if (op==2) {
        	System.out.println("Substraction of given number is=>"+(a-b));
        }
        else if(op==3){
        	System.out.println("Multiplication of given number is=>"+(a*b));
        }
        else if(op==4){
        	System.out.println("Division of given number is=>"+(a/b));
        }
	}

}
