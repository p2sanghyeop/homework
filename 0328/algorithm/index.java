// 자바스크립트 or 자바 선택해서 풀 것!
// 버블정렬을 이용하여 오름차순으로 정렬하고 총 몇회전 했는지 알아내시오.
let array = [1, 10, 4, 3, 5];
let count = 0; //총 몇회전 했는지 알아내는 변수
java로 선택해서 풀었습니다

package study;

import java.util.Arrays;

public class buble {

	public static void main(String[] args) {
		int array[] = {1, 10, 4, 3, 5};
		int count = 0; //총 몇회전 했는지 알아내는 변수
		Arrays.sort(array);
		for(int i=0; i<array.length; ++i) {
			++count;
			System.out.println(array[i]);
		}
		System.out.println("회전횟수="+count);
	}

}
console.log(array);
console.log(count);