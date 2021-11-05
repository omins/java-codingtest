/** 프로그래머스 Level 1 '이상한 문자 만들기' */
public class makeUpperLower {
	public String solution(String s) {
		char tmp;
		int count = 0;

		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			tmp = s.charAt(i);

			if (!Character.isAlphabetic(tmp)) {
				count = 0;
			}

			if (Character.isAlphabetic(tmp) && (count == 0 || count % 2 == 0)) {
				answer += s.valueOf(tmp).toUpperCase();
				count++;
			} else if (Character.isAlphabetic(tmp) && (count == 1 || count % 2 == 1)) {
				answer += s.valueOf(tmp).toLowerCase();
				count++;
			} else {
				answer += (char) tmp;
			}
		}
		return answer;
	}
}