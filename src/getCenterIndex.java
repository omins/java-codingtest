/** 프로그래머스 Level 1 '가운데 글자 가져오기' */
public class getCenterIndex {
	public String solution(String s) {
		String answer = "";

		int Q = Math.floorDiv(s.length(), 2);

		if (s.length() % 2 == 0) { // 짝수일 때는 2로 나눴을 때 몫 - 1, 몫 index가 중간값
			Character[] arr = new Character[2];
			arr[0] = s.charAt(Q - 1);
			arr[1] = s.charAt(Q);
			answer += arr[0];
			answer += arr[1];
		}

		if (s.length() % 2 == 1) { // 짝수일 때는 2로 나눴을 때 몫 index가 중간값
			answer = Character.toString(s.charAt(Q));
		}

		return answer;
	}

}
