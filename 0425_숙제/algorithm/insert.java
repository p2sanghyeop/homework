package ��������;

import java.util.Arrays;

public class insert {

	public static void main(String[] args) {

		int arr [] = {8,5,6,2,4};
		if(arr.length > 1) {
			int i = 0; 
			int j =0;
			for(i=1; i<arr.length; ++i) {
				int tmp = arr[i];
				for(j=i-1; j>=0; --j) {
					arr[j+1] = arr[j];
					if(tmp > arr[j]) {
						break;
					}
				}
				arr[j+1] = tmp;
			}
		}		
			System.out.println(Arrays.toString(arr));
	

}
}
