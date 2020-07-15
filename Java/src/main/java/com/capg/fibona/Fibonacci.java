package com.capg.fibona;

public class Fibonacci {

	public static void main(String[] args) {

int a=1,b=1,k;
System.out.println("1 1");
k=0;
while(k<=50) {
	k=a+b;
	System.out.println(k +"");
	a=b;
	b=k;
}



	}

}
