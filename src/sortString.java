/** 프로그래머스 Level 1 '문자열 내림차순으로 배치하기' */
import java.util.Arrays;
import java.util.Collections;

public class sortString {
	public String solution(String s) {

		Character[] arr = new Character[s.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}

		Arrays.sort(arr, Collections.reverseOrder());
		s = "";

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
}
