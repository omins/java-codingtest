/** 프로그래머스 Level 1 '문자열 내 p와 y의 개수' */
public class countingChar {
	boolean solution(String s) {
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pCount++;
			}
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yCount++;
			}
		}

		if (pCount == yCount || (pCount == 0 && yCount == 0)) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
}
