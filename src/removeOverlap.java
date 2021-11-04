
/** 프로그래머스 Level 1 '같은 숫자는 싫어' */
import java.util.ArrayList;
import java.util.List;

public class removeOverlap {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1])
				list.add(arr[i]);
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
