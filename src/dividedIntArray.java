
/** 프로그래머스 Level 1 '나누어 떨어지는 숫자 배열' */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dividedIntArray {
	public int[] solution(int[] arr, int divisor) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);
		return answer;
	}
}
