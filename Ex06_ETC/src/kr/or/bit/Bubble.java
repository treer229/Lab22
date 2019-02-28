package kr.or.bit;

public class Bubble {
	public static void main(String[] args) {
		
		int[] arr = {100,44, 60, 20, 70};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;

				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
	}
	
}
