
/** 프로그래머스 Level 1 '정수 내림차순으로 배치하기' */

import java.util.Arrays;
import java.util.Collections;

public class intReverseSort {
	public long solution(long n) {

		String temp = String.valueOf(n);
		Character[] arr = new Character[temp.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp.charAt(i);
		}

		Arrays.sort(arr, Collections.reverseOrder());

		temp = "";

		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
		}

		long answer = Long.valueOf(temp);
		return answer;
	}

}
