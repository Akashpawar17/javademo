package com.palin;

public class Palindrome {

	public static void main(String[] args) {

int n=121,r,s=0;
int temp=n;
while(n>0) {
	r=n%10;
	n=n/10;
	s=s*10+r;
}
if(temp==s) {
	System.out.println("palindrome");
}
else {
	System.out.println("not a palindrome ");
}

	}

}
