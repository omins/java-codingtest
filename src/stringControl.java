/** 프로그래머스 Level 1 '문자열 다루기 기본' */
public class stringControl {
	public boolean solution(String s) {
		boolean answer = true;
		char tmp;

		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				tmp = s.charAt(i);
				if (Character.isDigit(tmp) == false) {
					answer = false;
				}
			}
		} else {
			answer = false;
		}

		return answer;
	}
}
