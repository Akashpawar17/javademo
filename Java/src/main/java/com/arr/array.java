package com.arr;
//annonymous array
public class array {
	
	
	/*
	public static void ann(int arr[]) {
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}*/
	public static int[] get() {
	return new int[] {1,2,33,22};
	}
	

	public static void main(String[] args) {
		int arr[]=get();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//ann(new int[]{11,322,423});
		

	}

}
