package 상속;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
	int array []= {9, 6, 7, 3, 5};
	int max = 0;
	int temp = 0;
	for(int i=0; i<array.length-1; ++i) {
		max = i;
		for(int j=i+1; j<array.length; ++j) {
		 if(array[j] < array[max]) {
			 max = j;
		 }
		}
		temp = array[max]; 
		array[max] = array[i]; 
		array[i] = temp;
	}
	System.out.println(Arrays.toString(array));
	}
}
